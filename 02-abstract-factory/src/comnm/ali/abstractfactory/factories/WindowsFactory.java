package comnm.ali.abstractfactory.factories;

import comnm.ali.abstractfactory.products.button.Button;
import comnm.ali.abstractfactory.products.button.WindowsButton;
import comnm.ali.abstractfactory.products.checkbox.Checkbox;
import comnm.ali.abstractfactory.products.checkbox.WindowsCheckbox;
public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
