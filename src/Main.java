public class Main {

    public static void main(String[] args){
        Logistics logistics = new RoadLogistics();
//        logistics = new SeaLogistics();
        logistics.planDelivery();

        GUIFactory factory = new WindowsFactory();
        UI button = new Button();
        System.out.println(factory.createButton());
    }
}
