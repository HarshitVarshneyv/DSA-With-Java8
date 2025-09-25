package javaPractice.Array;

public class e_BestTimeToBuySell {
    public static void main(String[] args) {
        
    }
}


    class Solution {
        public int maxProfit(int[] prices) {
            int minPrice = prices[0] , profit = 0;

            for(int i = 1;i<prices.length;i++){
                profit = Math.max(profit , prices[i] - minPrice);
                minPrice = Math.min(minPrice , prices[i]);
            }
            return profit;
        }
    }