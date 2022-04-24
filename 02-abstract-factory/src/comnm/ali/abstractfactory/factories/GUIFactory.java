package comnm.ali.abstractfactory.factories;

import comnm.ali.abstractfactory.products.button.Button;
import comnm.ali.abstractfactory.products.checkbox.Checkbox;
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
