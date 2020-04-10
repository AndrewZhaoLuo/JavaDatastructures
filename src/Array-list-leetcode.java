// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        
        if (prices.length == 0){
            return maxprofit;
        }
        else{
            int min = prices[0];
        
            for (int i = 1; i< prices.length; i++) {
                if (prices[i] <= min){
                    min= prices[i];
                }
                else{
                    int tmp = prices[i]-min;
                    if(tmp > maxprofit){
                        maxprofit = tmp;
                    }
                }   
            }
            return maxprofit;
        }
    }
}
