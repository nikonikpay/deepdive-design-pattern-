package com.ali.factory;

public class HTMLButton implements Button{
    @Override
    public void render() {
        System.out.println("render in html");
    }

    @Override
    public void onClick() {
        System.out.println("click in html" );
    }
}
