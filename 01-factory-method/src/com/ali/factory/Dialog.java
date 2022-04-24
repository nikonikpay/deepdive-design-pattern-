package com.ali.factory;

public abstract class Dialog {

    abstract Button createButton();

    void renderButton(){
        Button okButton = createButton();
        okButton.onClick();
        okButton.render();
    }
}
