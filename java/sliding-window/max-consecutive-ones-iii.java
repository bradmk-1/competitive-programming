class Solution {
    public int longestOnes(int[] nums, int k) {
        int res = 0;
        int l = 0, r = 0;
        int zeros = 0;

        while (r < nums.length) {
            if (nums[r] == 0) { zeros++; }

            while (zeros > k) {
                if (nums[l] == 0) {
                    zeros--;
                }
                l++;
            }
            
            res = Math.max(res, r - l + 1);
            r++;
        }

        return res;
    }
}

// https://leetcode.com/problems/max-consecutive-ones-iii/
