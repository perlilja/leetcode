package se.codemnky.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidAnagramTest {

    ValidAnagram cut = new ValidAnagram();

    @Test
    void shouldHandleNullValues() {
        cut.isAnagram(null, null);
    }

    @Test
    void shouldHandleEmptyStrings() {
        cut.isAnagram("", "");
    }

    @Test
    void shouldReturnTrueIfValid() {
        Assertions.assertTrue(cut.isAnagram("anagram", "nagaram"));
    }

    @Test
    void shouldReturnFalseIfInvalid() {
        Assertions.assertFalse(cut.isAnagram("rat", "car"));
    }

    @Test
    void shouldReturnFalseIfInvalidWithSameCharactersButDifferentOccurances() {
        Assertions.assertFalse(cut.isAnagram("aacc", "ccac"));
    }


}
