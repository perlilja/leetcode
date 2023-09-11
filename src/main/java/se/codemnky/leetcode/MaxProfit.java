package se.codemnky.leetcode;

public class MaxProfit {

    public int maxProfit(int[] prices) {
        int lowestBuyValue = Integer.MAX_VALUE;
        int maxProfit = 0;


        for (int i = 0; i < prices.length; i++) {

            if (prices[i] < lowestBuyValue) {
                lowestBuyValue = prices[i];
            }

            int profit = prices[i] - lowestBuyValue;

            if (maxProfit < profit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }
}
