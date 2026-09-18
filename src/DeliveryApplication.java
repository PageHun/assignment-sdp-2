public class DeliveryApplication {
    private GUIFactory factory;
    private Logistics logistics;
    private final Button button;
    private final Checkbox checkbox;

    public DeliveryApplication(GUIFactory factory){
        this.factory = factory;
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void render(Logistics logistics, String cargo, String destination){
        button.paint();
        checkbox.paint();

        logistics.planDelivery(cargo, destination);
    }
}
