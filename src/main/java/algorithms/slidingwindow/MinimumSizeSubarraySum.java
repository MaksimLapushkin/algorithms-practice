package algorithms.slidingwindow;

import static java.lang.Math.min;

public class MinimumSizeSubarraySum {

    public int minSubArrayLen(int target, int[] nums){

        int left = 0;
        int sum = 0;
        int bestLen = Integer.MAX_VALUE;

        for (int right = 0; right<nums.length; right++){
            sum+=nums[right];
            while (sum>=target){
                bestLen = min(bestLen, right - left + 1);
                sum-=nums[left];
                left++;
            }
        }

        if (bestLen != Integer.MAX_VALUE){
            return bestLen;
        }
        else {
            return 0;
        }
    }
}
