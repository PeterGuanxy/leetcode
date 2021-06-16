package algorithms._0309_best_time_to_buy_and_sell_stock_with_cooldown;

/**
 * ** Created by peter.guan on 2021/06/16.
 *
 * @author peter.guan
 */
public class BestTimeToBuyAndSellStockWithCooldown {

    public int maxProfit(int[] prices) {

        if (prices.length < 2) {
            return 0;
        }

        int f0 = -prices[0];
        int f1 = 0;
        int f2 = 0;

        for (int i = 1; i < prices.length; i++) {
            int newf0 = Math.max(f0, f2 - prices[i]);
            int newf1 = f0 + prices[i];
            int newf2 = Math.max(f1, f2);
            f0 = newf0;
            f1 = newf1;
            f2 = newf2;
        }

        return Math.max(f1, f2);

    }
}
