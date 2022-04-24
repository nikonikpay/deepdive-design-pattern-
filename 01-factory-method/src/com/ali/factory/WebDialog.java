package com.ali.factory;

public class WebDialog extends Dialog {
    @Override
    Button createButton() {
        return new HTMLButton();
    }
}
