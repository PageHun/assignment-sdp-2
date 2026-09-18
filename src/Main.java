import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        GUIFactory factory = new WindowsFactory();
        Logistics logistics = new RoadLogistics();
        String cargo = "Laboratory";
        String destination = "Aktay warehouse";

        while(true){
            System.out.println("========= Delivery =========");
            System.out.println("1. Choose the delivery mode");
            System.out.println("2. Choose the UI platform");
            System.out.println("3. Add a cargo");
            System.out.println("4. Choose destination");
            System.out.println("0. exit");
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
                    validateConfiguration(logistics, factory);
                    DeliveryApplication application = new DeliveryApplication(factory);
                    application.render();
                    logistics.planDelivery(cargo, destination);
                    return;
                default:
                    System.out.println("Invalid choice");
                    return;
            }
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

    public static Logistics chooseDeliveryMode(Scanner scanner, Logistics logistics){
        System.out.println("========= Delivery =========");
        System.out.println("1. ROAD");
        System.out.println("2. SEA");
        System.out.println("0. exit");
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
        System.out.println("========= Delivery =========");
        System.out.println("1. WINDOWS");
        System.out.println("2. MACOS");
        System.out.println("0. exit");
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
        System.out.println("========= Delivery =========");
        System.out.print("Set cargo: ");
        return scanner.next();
    }

    private static String setDestination(Scanner scanner){
        System.out.println("========= Delivery =========");
        System.out.print("Set destination: ");
        return scanner.next();
    }
}
