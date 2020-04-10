// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length <0){
            throw new IndexOutOfBoundsException();
        }
        else if (prices.length == 0){
            return 0;
        }
        else{
            int min = prices[0];
            int maxprofit = 0;
            int tmp =0;
        
            for (int i = 1; i< prices.length; i++) {
                if (prices[i] <= min){
                    min= prices[i];
                }
                else{
                    tmp = prices[i]-min;
                    if(tmp > maxprofit){
                        maxprofit = tmp;
                    }
                }   
            }
            return maxprofit;
        }
    }
}
