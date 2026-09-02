class Solution {
    public int maxProfit(int k, int[] prices) {
        if (prices.length == 0) {
            return 0;
        }

        if (k >= prices.length / 2) {
            int profit = 0;

            for (int i = 1; i < prices.length; i++) {
                if (prices[i] > prices[i - 1]) {
                    profit += prices[i] - prices[i - 1];
                }
            }

            return profit;
        }

        int[][] dp = new int[k + 1][2];

        for (int i = 0; i <= k; i++) {
            dp[i][1] = Integer.MIN_VALUE / 2;
        }

        for (int price : prices) {
            for (int j = k; j >= 1; j--) {
                dp[j][0] = Math.max(dp[j][0], dp[j][1] + price);
                dp[j][1] = Math.max(dp[j][1], dp[j - 1][0] - price);
            }
        }

        return dp[k][0];
    }
}