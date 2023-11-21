// src/main/java/com/example/utils/StringUtils.java

package com.example.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        try {
            double value = Double.parseDouble(str);
            return value > 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
