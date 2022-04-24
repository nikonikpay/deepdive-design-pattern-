package comnm.ali.abstractfactory.products.button;

public class MacOsButton implements Button{
    @Override
    public void paint() {
        System.out.println("this is mac os button");
    }
}
