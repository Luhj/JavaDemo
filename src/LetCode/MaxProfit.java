package LetCode;

/**
 * Created by Luhaijie on 2018/9/9.
 */
public class MaxProfit {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;

        int result = 0;
        int lastLowestPrice = prices[0];
        int nowHighestPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i - 1] < prices[i]) {
                nowHighestPrice = prices[i];
                if (i == prices.length - 1) {
                    result += nowHighestPrice - lastLowestPrice;
                }
            } else {
                result += nowHighestPrice - lastLowestPrice;
                nowHighestPrice = lastLowestPrice = prices[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        MaxProfit maxProfit = new MaxProfit();
        int[] prices = {7, 1, 5, 3, 6, 4, 1, 2, 3, 4, 5};
//        int[] prices = {1,2,3,4,5};
//        int[] prices = {7, 1, 5, 3, 6, 4};
//        int[] prices = {7, 6, 4, 3, 1};
        System.out.println(maxProfit.maxProfit(prices));
    }
}
