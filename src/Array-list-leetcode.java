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

// https://leetcode.com/problems/search-insert-position/
class Solution {
    public int searchInsert(int[] nums, int target) {
            int low = 0;
            int high = nums.length -1;
            int mid=0;

            while(low <= high)
            {
                mid = (high+low)/2;
                
                if(nums[mid] == target){
                    return mid;
                }
                else if(nums[mid]>target){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
            return low;
    }
}
