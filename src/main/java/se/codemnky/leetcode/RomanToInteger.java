package se.codemnky.leetcode;

import java.util.HashMap;

public class RomanToInteger {

    public int romanToInt(String s) {
        char[] chars = s.toCharArray();
        HashMap<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;

        for (int i = 0; i < chars.length; i++) {
            if (i + 1 < chars.length && romanValues.get(chars[i]) < romanValues.get(chars[i + 1])) {
                // If the current roman number is less than the next, it means we have the cases of
                // for example IV or IX, And the current number is I, so therefor we are subtracting the current corresponding
                // decimal value.
                result -= romanValues.get(chars[i]);
            } else {
                result += romanValues.get(chars[i]);
            }
        }

        return result;
    }
}
