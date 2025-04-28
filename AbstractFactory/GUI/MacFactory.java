package systemDesign.AbstractFactory.GUI;

public class MacFactory implements GUIFactory {

    @Override
    public ITextbox textbox() {
        return new MacText();
    }

    @Override
    public ICheckBox checkBox() {
        return new MacCheck();
    }

}
