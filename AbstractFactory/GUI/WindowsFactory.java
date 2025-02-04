package systemDesign.AbstractFactory.GUI;

public class WindowsFactory implements GUIFactory {

    @Override
    public ITextbox textbox() {
        return new WindowText();
    }

    @Override
    public ICheckBox checkBox() {
        return new WindowCheck();
    }

}
