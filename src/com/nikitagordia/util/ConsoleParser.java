package com.nikitagordia.util;

import com.nikitagordia.exception.BadNumber;
import com.nikitagordia.exception.BadNumberFormat;
import com.nikitagordia.exception.WrongArgumentsCount;

public class ConsoleParser {

    private static String EXIT = "exit";
    private static String INNER = "inner";
    private static String OUTER = "outer";

    public static boolean isExit(String cmd) {
        return cmd.equalsIgnoreCase(EXIT);
    }

    public static long parseInnerRequest(String cmd) throws WrongArgumentsCount, BadNumberFormat, BadNumber {
        String[] splited = cmd.split(" ");
        if (splited.length == 0) return -1;
        if (splited[0].equalsIgnoreCase(INNER)) {
            if (splited.length != 2) throw new WrongArgumentsCount(2, splited.length);
            try {
                long result = Long.parseLong(splited[1]);
                if (result < 0) throw new BadNumber(result);
                return result;
            } catch (NumberFormatException e) {
                throw new BadNumberFormat(splited[1]);
            }
        } else return -1;
    }

    public static boolean parseOuterRequest(String cmd) {
        return cmd.equalsIgnoreCase(OUTER);
    }
}
