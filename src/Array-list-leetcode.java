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

// https://leetcode.com/problems/plus-one/
public int[] plusOne(int[] digits) {
        int len = digits.length;
        int carryover =0;
        
        digits[len-1] = digits[len-1] +1;
            
        for (int i = len-1;i>=0; i--){
            digits[i] = digits[i] + carryover;
            if(digits[i] == 10){
                digits[i] = 0;        
                carryover =1;
            } 
            else{   
                return digits;
                }
            }
        }
        
        if(carryover == 1){
            int[] tmp = new int[len+1];
            tmp[0]=1;
            for(int j = 1; j<len+1; j++){
                tmp[j]= digits[j-1];
            }
            return tmp;
        }
        return digits;
    }
