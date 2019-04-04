package com.nikitagordia.exception;

public class WrongArgumentsCount extends Exception {

    public WrongArgumentsCount(int expectedCount, int realCount) {
        super("Expected " + expectedCount + " arguments, but found " + realCount);
    }
}
