public class DeliveryApplication {
    private Button button;
    private Checkbox checkbox;

    public DeliveryApplication(GUIFactory factory){
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void render(){
        button.paint();
        checkbox.paint();
    }
}
