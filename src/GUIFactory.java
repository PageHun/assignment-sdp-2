interface Button{
    void paint();
}
interface Checkbox{
    void paint();
}

// Windows

class WindowsButton implements Button{
    public void paint(){
        System.out.println("Rendering Windows Button");
    }
}
class WindowsCheckbox implements Checkbox{
    public void paint(){
        System.out.println("Rendering Windows Checkbox");
    }
}

// MacOS

class MacOSButton implements Button{
    public void paint(){
        System.out.println("Rendering MacOS Button");
    }
}
class MacOSCheckbox implements Checkbox{
    public void paint(){
        System.out.println("Rendering MacOS Checkbox");
    }
}

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}

class MacOSFactory implements GUIFactory{
    @Override
    public Button createButton(){
        return new MacOSButton();
    }
    @Override
    public Checkbox createCheckbox(){
        return new MacOSCheckbox();
    }
}

class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton(){
        return new WindowsButton();
    }
    @Override
    public Checkbox createCheckbox(){
        return new WindowsCheckbox();
    }
}