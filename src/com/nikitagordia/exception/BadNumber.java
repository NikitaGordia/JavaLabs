package com.nikitagordia.exception;

public class BadNumber extends Exception {

    public BadNumber(long number) {
        super("Number can not be negative. Your input: " + number);
    }
}
