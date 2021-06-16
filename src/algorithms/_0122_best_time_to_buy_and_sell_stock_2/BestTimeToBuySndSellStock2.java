package algorithms._0122_best_time_to_buy_and_sell_stock_2;

/**
 * ** Created by peter.guan on 2021/06/16.
 *
 * @author peter.guan
 */
public class BestTimeToBuySndSellStock2 {

    public int maxProfit(int[] prices) {

        if (prices.length < 2) {
            return 0;
        }

        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                maxProfit = maxProfit + (prices[i] - prices[i - 1]);
            }
        }
        return maxProfit;
    }

}
