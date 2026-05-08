import java.util.*;
class maxSubArray {
    public int maxSubArray(int[] nums) {
        int curr = 0;
        int maxsum = nums[0];
        for(int x : nums){
            curr = Math.max(x,curr+x);
            maxsum = Math.max(maxsum,curr);
        }
        return maxsum;
    }
}