public class DeliveryApplication {
    private GUIFactory factory;
    private Logistics logistics;
    private final Button button;
    private final Checkbox checkbox;

    public DeliveryApplication(GUIFactory factory, Logistics logistics){
        this.factory = factory;
        this.logistics = logistics;
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void render(String cargo, String destination){
        button.paint();
        checkbox.paint();

        logistics.planDelivery(cargo, destination);
    }
}
