package src.java.best_time_to_buy_and_sell_stock;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        if (prices.length < 2) {
            return 0; // Need at least two days to make a profit
        }

        int maxProfit = 0;
        int buyPrice = prices[0]; // Start with the first day as the buy price

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buyPrice) {
                buyPrice = prices[i]; // Found a new lower buy price
            } else {
                maxProfit = Math.max(maxProfit, prices[i] - buyPrice); // Update max profit if selling today is better
            }
        }

        return maxProfit;
    }

}
