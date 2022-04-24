package com.ali.factory;

public class AppClass {

    Dialog dialog;
    String operationSystem;

    public AppClass(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    public Dialog getDialog() {
        return dialog;
    }

    public void setDialog(Dialog dialog) {
        this.dialog = dialog;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    public void initialize() {
        if(operationSystem == "Windows") {
            dialog = new WindowsDialog();
        } else if(operationSystem == "Web") {
            dialog = new WebDialog();
        } else {
            try {
                throw new Exception("This is not valid");
            } catch(Exception e) {
                e.printStackTrace();
            }
        }


    }


}
