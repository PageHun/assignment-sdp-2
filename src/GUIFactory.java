interface UI{
    void paint();
}

interface Button extends UI{
    @Override
    void paint();
}
interface Checkbox extends UI{
    void paint();
}

// Windows

class WindowsButton implements Button{
    public void paint(){
        System.out.println("Windows Button");
    }
}
class WindowsCheckbox implements Checkbox{
    public void paint(){
        System.out.println("Windows Checkbox");
    }
}

// MacOS

class MacOSButton implements Button{
    public void paint(){
        System.out.println("MacOS Button");
    }
}
class MacOSCheckbox implements Checkbox{
    public void paint(){
        System.out.println("MacOS Checkbox");
    }
}

public interface GUIFactory {
    UI createButton();
    UI createCheckbox();
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