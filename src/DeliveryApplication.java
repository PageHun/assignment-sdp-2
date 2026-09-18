public class DeliveryApplication {
    private final Button button;
    private final Checkbox checkbox;

    public DeliveryApplication(GUIFactory factory){
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void render(){
        button.paint();
        checkbox.paint();
    }
}
