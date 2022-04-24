package comnm.ali.abstractfactory.factories;

import comnm.ali.abstractfactory.products.button.Button;
import comnm.ali.abstractfactory.products.button.MacOsButton;
import comnm.ali.abstractfactory.products.checkbox.Checkbox;
import comnm.ali.abstractfactory.products.checkbox.MacCheckBox;
public class MacOsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacOsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckBox();
    }
}
