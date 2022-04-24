package comnm.ali.abstractfactory.products.button;

public class WindowsButton implements Button{
    @Override
    public void paint() {
        System.out.println("this is windows button");
    }
}
