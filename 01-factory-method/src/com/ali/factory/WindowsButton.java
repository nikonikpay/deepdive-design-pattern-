package com.ali.factory;

public class WindowsButton implements Button{


    @Override
    public void render() {
        System.out.println("Render in windows");
    }

    @Override
    public void onClick() {
        System.out.println("Click in windows");
    }
}
