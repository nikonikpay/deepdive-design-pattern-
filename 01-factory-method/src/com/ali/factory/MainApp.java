package com.ali.factory;

public class MainApp {
    public static void main(String[] args) {
        AppClass myAppClass = new AppClass("Web");

        myAppClass.initialize();
        myAppClass.dialog.renderButton();

        System.out.println(myAppClass.getDialog());

    }
}
