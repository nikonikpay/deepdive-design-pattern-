package comnm.ali.abstractfactory.products.checkbox;

public class WindowsCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("This is windows check box");
    }
}
