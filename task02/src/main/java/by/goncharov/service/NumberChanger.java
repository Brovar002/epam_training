package by.goncharov.service;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Class for translate numbers.
 * @author Goncharov Daniil
 * @version 1.0
 * @see by.goncharov.controller.NumberChangerCommand
 */

public class NumberChanger {
    public String numberChanger(int n) {
        LinkedHashMap<String, Integer> romanNumerals = new LinkedHashMap<String, Integer>();
        romanNumerals.put("M", 1000);
        romanNumerals.put("CM", 900);
        romanNumerals.put("D", 500);
        romanNumerals.put("CD", 400);
        romanNumerals.put("C", 100);
        romanNumerals.put("XC", 90);
        romanNumerals.put("L", 50);
        romanNumerals.put("XL", 40);
        romanNumerals.put("X", 10);
        romanNumerals.put("IX", 9);
        romanNumerals.put("V", 5);
        romanNumerals.put("IV", 4);
        romanNumerals.put("I", 1);
        String res = "";
        for(Map.Entry<String, Integer> entry : romanNumerals.entrySet()){
            int matches = n/entry.getValue();
            res += repeat(entry.getKey(), matches);
            n = n % entry.getValue();
        }
        return res;
    }
    public static String repeat(String s, int n) {
        if(s == null) {
            return null;
        }
        final StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            sb.append(s);
        }
        return sb.toString();
    }
}
