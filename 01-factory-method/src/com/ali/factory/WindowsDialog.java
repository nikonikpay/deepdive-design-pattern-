package com.ali.factory;

public class WindowsDialog extends Dialog{

    @Override
    Button createButton() {
        return  new WindowsButton();

    }
}
