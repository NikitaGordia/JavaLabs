package com.nikitagordia.util;

public class StaticInfo {

    private static String[] firstNames = new String[] {
            "Nick",
            "Petr",
            "Paul",
            "Bob",
            "Erich",
    };

    private static String[] secondNames = new String[] {
            "Gordia",
            "Bohdan",
            "Glushko",
            "Bolotenyk",
            "Maria Remarque"
    };

    private static String[] patronymic = new String[] {
            "Michailovich",
            "Petrovich",
            "Alexiovich"
    };

    private static String[] address = new String[] {
            "Kremenchug, st. Makarenka, 8",
            "Kiev, st. Akademica Yangela, 89"
    };

    public static String[] getFirstNames() {
        return firstNames;
    }

    public static String[] getSecondNames() {
        return secondNames;
    }

    public static String[] getPatronymic() {
        return patronymic;
    }

    public static String[] getAddress() {
        return address;
    }
}
