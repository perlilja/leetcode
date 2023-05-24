package se.codemnky.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * 3. Longest Substring Without Repeating Characters
 */
public class LongestSubString {

    public int lengthOfLongestSubstring(String s) {
        int inputLength = s.length();
        Set<Character> characters = new HashSet<>();
        int answere = 0, i = 0, j = 0;

        while (i < inputLength && j < inputLength) {
            // Try to extend the range [i, j]
            if (!characters.contains(s.charAt(j))){
                characters.add(s.charAt(j++));
                answere = Math.max(answere, j - i);
            }
            else {
                characters.remove(s.charAt(i++));
            }
        }
        return answere;
    }
}
