package systemDesign.AbstractFactory.GUI;

public class Main {

    public static void createUI(GUIFactory fact) {
        ICheckBox checkBox = fact.checkBox();
        ITextbox textbox = fact.textbox();

        checkBox.check();
        textbox.text();
    }

    public static void main(String[] args) {
        GUIFactory mFactory = new MacFactory();
        createUI(mFactory);

        GUIFactory windFactory = new WindowsFactory();
        createUI(windFactory);
    }

}
