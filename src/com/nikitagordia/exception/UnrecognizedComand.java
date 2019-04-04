package com.nikitagordia.exception;

public class UnrecognizedComand extends Exception {

    public UnrecognizedComand(String cmd) {
        super("Unknown command : \"" + cmd + "\". Please, try again");
    }
}
