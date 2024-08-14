class Solution {
    public int maxProfit(int[] prices) {

    int minPrice = Integer.MAX_VALUE;
    int maxProfit = 0;

    for (int i = 0; i < prices.length; i++) {
        if (prices[i] < minPrice) {
            minPrice = prices[i];  // Update the minimum price
        } else {
            int profit = prices[i] - minPrice;  // Calculate profit
            if (profit > maxProfit) {
                maxProfit = profit;  // Update the maximum profit
            }
        }
    }

    return maxProfit;
        
    }
}