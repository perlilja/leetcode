package se.codemnky.leetcode;

public class Zigzag {

    public String convert(String s, int numRows) {
        // If the number of row is 1, return the string as it is
        if (numRows == 1)
            return s;

        StringBuilder sb = new StringBuilder();

        int step = 2 * numRows - 2;
        for (int sPosition = 0; sPosition < numRows; sPosition++) {

            // This is for the first and last column,
            // we only need to take every "step" characters in the string
            if (sPosition == 0 || sPosition == numRows - 1) {
                for (int j = sPosition; j < s.length(); j = j + step) {
                    sb.append(s.charAt(j));
                }
            } else {
                int j = sPosition;
                boolean flag = true;
                int step1 = 2 * (numRows - 1 - sPosition);
                int step2 = step - step1;
                while (j < s.length()) {
                    sb.append(s.charAt(j));
                    if (flag)
                        j = j + step1;
                    else
                        j = j + step2;
                    flag = !flag;
                }
            }
        }
        return sb.toString();
    }
}
