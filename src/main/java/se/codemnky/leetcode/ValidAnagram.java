package se.codemnky.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;

public class ValidAnagram {

    /**
     * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
     *
     * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
     * typically using all the original letters exactly once.
     *
     * @param s
     * @param t
     * @return
     */
    public boolean isAnagram(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> charactersOfs = new HashMap<>();
        HashMap<Character, Integer> charactersOft = new HashMap<>();

        for (int i = 0; i < s.length();i++) {
            charactersOfs.put(s.charAt(i), charactersOfs.getOrDefault(s.charAt(i), 0)+1);
            charactersOft.put(t.charAt(i), charactersOft.getOrDefault(t.charAt(i), 0)+1);
        }

        for (Map.Entry<Character, Integer> entry : charactersOfs.entrySet()) {
            Character key = entry.getKey();
            Integer occurrences = entry.getValue();
            if (!charactersOft.containsKey(key) || !Objects.equals(charactersOft.get(key), occurrences)) {
                return false;
            }

        }

        return true;
    }
}
