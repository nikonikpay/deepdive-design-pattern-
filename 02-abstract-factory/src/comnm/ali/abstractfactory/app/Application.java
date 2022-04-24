package comnm.ali.abstractfactory.app;

import comnm.ali.abstractfactory.factories.GUIFactory;
import comnm.ali.abstractfactory.products.button.Button;
import comnm.ali.abstractfactory.products.checkbox.Checkbox;


public class Application {
    private Button button;
    private Checkbox checkBox;


    public Application(GUIFactory factory) {
        this.button = factory.createButton();
        this.checkBox = factory.createCheckbox();
    }


    public void paint(){
        button.paint();
        checkBox.paint();
    }

}
