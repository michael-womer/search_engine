package com.mwomer.app.classes;

public class Dispatchable{
    
    public boolean error = false;
    public String errorMessage = "";
    public String command = "";
    public String[] options = {};

    public Dispatchable(boolean error, String errorMessage, String command, String[] options) {
        this.error = error;
        this.errorMessage = errorMessage;
        this.command = command;
        this.options = options;
    }

    public Dispatchable(boolean error, String errorMessage, String command) {
        this.error = error;
        this.errorMessage = errorMessage;
        this.command = command;
    }

    public Dispatchable(boolean error, String errorMessage) {
        this.error = error;
        this.errorMessage = errorMessage;
    }

    public void execute() {
        System.out.println(toString());
    }

    public String toString() {
        return errorMessage;
    }
}