package se.codemnky.leetcode;

/**
 * 5. Longest Palindromic Substring
 * Given a string s, return the longest
 * palindromic
 *
 * substring
 *  in s.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "babad"
 * Output: "bab"
 * Explanation: "aba" is also a valid answer.
 *
 * Example 2:
 *
 * Input: s = "cbbd"
 * Output: "bb"
 */
public class LongestPalindrome {

    public String longestPalindrome(String s) {

        // Empty string
        if (s == null || s.length() < 1) {
            return "";
        }

        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            // Get the longest palindrom of the two
            int len = Math.max(len1, len2);

            // if the length of the current palindrome is greater than the length of the previously found
            // longest palindrome, it updates the start and end indices of the longest palindrome
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    // Start from the center a step outwards and check if each characters in the posions stepLeft and stepRight are the same
    private int expandAroundCenter(String s, int left, int right) {
        int stepLeft = left, stepRight = right;
        while (stepLeft >= 0 && stepRight < s.length() && s.charAt(stepLeft) == s.charAt(stepRight)) {
            stepLeft--;
            stepRight++;
        }
        return stepRight - stepLeft - 1;
    }

}
