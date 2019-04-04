package com.nikitagordia.exception;

public class BadNumberFormat extends Exception {

    public BadNumberFormat(String obj) {
        super("Cannot parse number from \"" + obj + "\"");
    }
}
