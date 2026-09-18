import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        GUIFactory factory = null;

        while(true){
            System.out.println("========= Delivery =========");
            System.out.println("1. Choose the delivery mode");
            System.out.println("2. Choose the UI platform");
            System.out.println("3. Add a cargo");
            System.out.println("4. Choose destination");
            System.out.println("0. exit");
            int choice = scanner.nextInt();
            switch (choice){
                case 1: chooseDeliveryMode;
                case 2: chooseUIPlatform;
                case 3: addCargo;
                case 4: chooseDestination;
                case 0: break;
                default: System.out.println("Invalid choice");
            }
        }

        DeliveryApplication application = new DeliveryApplication(factory);
        application.render();

        private static void chooseDeliveryMode(){
            System.out.println("========= Delivery =========");
            System.out.println("1. ROAD");
            System.out.println("2. SEA");
            System.out.println("0. exit");
            int choice = scanner.nextInt();

            switch (choice){
                case 1: ;
                case 2: ;
                case 0: break;
                default: System.out.println("Invalid choice");
            }
        }

        private static void chooseUIPlatform(){
            System.out.println("========= Delivery =========");
            System.out.println("1. WINDOWS");
            System.out.println("2. MACOS");
            System.out.println("0. exit");
            int choice = scanner.nextInt();

            switch (choice){
                case 1: ;
                case 2: ;
                case 0: break;
                default: System.out.println("Invalid choice");
            }
        }

        private static void chooseDeliveryMode(){
            System.out.println("========= Delivery =========");
            System.out.println("1. ROAD");
            System.out.println("2. SEA");
            System.out.println("0. exit");
            int choice = scanner.nextInt();

            switch (choice){
                case 1: ;
                case 2: ;
                case 0: break;
                default: System.out.println("Invalid choice");
            }
        }
    }
}
