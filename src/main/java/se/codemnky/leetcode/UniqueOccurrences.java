package se.codemnky.leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueOccurrences {

    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> occurrences = new HashMap<>();

        for (int j : arr) {
            occurrences.put(j, occurrences.getOrDefault(j, 0) + 1);
        }

        HashSet<Integer> counter = new HashSet<>(occurrences.values());
        return counter.size() == occurrences.size();
    }
}
