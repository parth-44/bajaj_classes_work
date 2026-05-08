// LeetCode #198 - House Robber
import java.util.HashMap;
import java.util.Map;

class Solution {
    Map<Integer, Integer> memo = new HashMap<>();

    public int rob(int[] nums) {
        return dp(nums, 0);
    }

    private int dp(int[] nums, int i) {
        if (i >= nums.length) return 0;
        if (memo.containsKey(i)) return memo.get(i);
        int result = Math.max(dp(nums, i + 1), nums[i] + dp(nums, i + 2));
        memo.put(i, result);
        return result;
    }
}
