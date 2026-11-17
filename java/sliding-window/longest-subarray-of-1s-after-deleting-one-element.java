class Solution {
    public int longestSubarray(int[] nums) {
        int l = 0, r = 0;
        int res = 0;
        int zeros = 0;

        while (r < nums.length) {
            if (nums[r] == 0) { zeros++; }

            while (zeros > 1) {
              if (nums[l] == 0) { zeros--; }
              l++;
            }
            
            res = Math.max(res, r - l);
            r++;
        }

        return res;
    }
}

// https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/
