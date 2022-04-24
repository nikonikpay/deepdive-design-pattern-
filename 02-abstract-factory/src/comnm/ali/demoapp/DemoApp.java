package comnm.ali.demoapp;

import comnm.ali.abstractfactory.app.Application;
import comnm.ali.abstractfactory.factories.GUIFactory;
import comnm.ali.abstractfactory.factories.MacOsFactory;
import comnm.ali.abstractfactory.factories.WindowsFactory;


public class DemoApp {
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOsFactory();
            app = new Application(factory);
        } else {
            factory = new WindowsFactory();
            app = new Application(factory);
        }
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }



}
