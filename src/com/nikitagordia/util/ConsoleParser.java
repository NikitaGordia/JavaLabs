package com.nikitagordia.util;

public class ConsoleParser {

    private static String EXIT = "exit";
    private static String INNER = "inner";
    private static String OUTER = "outer";

    public static boolean isExit(String cmd) {
        return cmd.equalsIgnoreCase(EXIT);
    }

    public static long isInnerRequest(String cmd) {
        String[] splited = cmd.split(" ");
        if (splited.length == 2) {
            try {
                long req = Long.parseLong(splited[1]);
                if (splited[0].equalsIgnoreCase(INNER)) return req; else return -1L;
            } catch (NumberFormatException e) {
                return -1L;
            }
        } else {
            return -1L;
        }
    }

    public static boolean isOuterRequest(String cmd) {
        return cmd.equalsIgnoreCase(OUTER);
    }
}
