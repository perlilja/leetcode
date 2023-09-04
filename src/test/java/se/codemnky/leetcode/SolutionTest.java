package se.codemnky.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import se.codemnky.leetcode.Solution.Solution;

public class SolutionTest {

    Solution solution = new Solution();


    @Test
    void testOne() {
        Assertions.assertEquals(1, solution.solution(new String[]{"###", "#.#", "#*#", "#.#", "#.#", "#.#"}));

    }


}
