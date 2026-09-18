import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        GUIFactory factory = null;
        Logistics logistics = null;
        String cargo = null;
        String destination = null;
        try{
            while(true){
                System.out.println("======= Delivery System =======");
                System.out.println("1. Choose the delivery mode");
                System.out.println("2. Choose the UI platform");
                System.out.println("3. Add a cargo");
                System.out.println("4. Choose destination");
                System.out.println("0. exit");
                System.out.println("===============================");
                System.out.print("Your choice: ");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        logistics = chooseDeliveryMode(scanner, logistics);
                        break;
                    case 2:
                        factory = chooseUIPlatform(scanner, factory);
                        break;
                    case 3:
                        cargo = setCargo(scanner);
                        break;
                    case 4:
                        destination = setDestination(scanner);
                        break;
                    case 0:
                        if (checkData(cargo, destination)){
                            break;
                        }

                        if (logistics == null || factory == null) {
                            defineError(logistics, factory);
                            break;
                        }

                        System.out.println("======= Delivery System =======");
                        validateConfiguration(logistics, factory);
                        DeliveryApplication application = new DeliveryApplication(factory, logistics);
                        application.render(cargo, destination);
                        System.out.println("===============================");
                        return;
                    default:
                        System.out.println("Invalid choice");
                        break;
                }
            }
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static void validateConfiguration(Logistics logistics, GUIFactory factory){
        if(logistics instanceof RoadLogistics){
            System.out.println("Delivery mode: ROAD");
        } else if(logistics instanceof SeaLogistics){
            System.out.println("Delivery mode: SEA");
        }

        if(factory instanceof MacOSFactory){
            System.out.println("UI platform: MACOS");
        } else if(factory instanceof WindowsFactory){
            System.out.println("UI platform: WINDOWS");
        }
    }

    public static Boolean checkData(String cargo, String destination){
        if(cargo != null && destination == null){
            System.out.println("Destination is missing!");
            return true;
        } else if(cargo == null && destination != null){
            System.out.println("Cargo is missing!");
            return true;
        } else if(cargo == null && destination == null){
            System.out.println("Cargo and destination are missing!");
            return true;
        } else return false;
    }

    public static void defineError(Logistics logistics, GUIFactory factory){
        if(logistics == null && factory != null){
            System.out.println("Delivery mode is unsupported with a valid UI platform!");
        } else if(logistics != null && factory == null){
            System.out.println("UI platform is unsupported with a valid delivery mode!");
        } else {
            System.out.println("Both delivery mode and UI platform are unsupported!");
        }
    }

    public static Logistics chooseDeliveryMode(Scanner scanner, Logistics logistics){
        System.out.println("======= Delivery System =======");
        System.out.println("1. ROAD");
        System.out.println("2. SEA");
        System.out.println("0. exit");
        System.out.println("===============================");
        System.out.print("Your choice: ");
        int choice = scanner.nextInt();

        switch (choice){
            case 1: return new RoadLogistics();
            case 2: return new SeaLogistics();
            case 0: return logistics;
            default:
                System.out.println("Invalid choice");
                return logistics;
        }
    }

    private static GUIFactory chooseUIPlatform(Scanner scanner, GUIFactory factory){
        System.out.println("======= Delivery System =======");
        System.out.println("1. WINDOWS");
        System.out.println("2. MACOS");
        System.out.println("0. exit");
        System.out.println("===============================");
        System.out.print("Your choice: ");
        int choice = scanner.nextInt();

        switch (choice){
            case 1: return new WindowsFactory();
            case 2: return new MacOSFactory();
            case 0: return factory;
            default: System.out.println("Invalid choice");
        }
        return null;
    }

    private static String setCargo(Scanner scanner){
        System.out.println("======= Delivery System =======");
        System.out.print("Set cargo: ");
        scanner.nextLine();
        return scanner.nextLine();
    }

    private static String setDestination(Scanner scanner){
        System.out.println("======= Delivery System =======");
        System.out.print("Set destination: ");
        scanner.nextLine();
        return scanner.nextLine();
    }
}
