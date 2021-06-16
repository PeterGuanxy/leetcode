package algorithms._0121_best_time_to_buy_and_sell_stock;

/**
 * ** Created by peter.guan on 2021/06/16.
 *
 * @author peter.guan
 */
public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {

        if (prices.length <= 1) {
            return 0;
        }
        int low = prices[0];
        int high = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < low) {
                low = prices[i];
                high = prices[i];
            }
            if (prices[i] > high) {
                high = prices[i];
            }
            profit = Math.max(profit, high - low);
        }
        return profit;
    }
}
