import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        GUIFactory factory = null;

        while(true){
            String OS = scanner.next();
            if (OS.equals("MAC")){
                factory = new MacOSFactory();
                break;
            } else if(OS.equals("WINDOWS")){
                factory = new WindowsFactory();
                break;
            }
        }

        DeliveryApplication application = new DeliveryApplication(factory);
        application.render();
    }
}
