class Solution {
    public long countSubarrays(int[] nums, long k) {
        long res = 0;
        long sum = 0;
        int l = 0, r = 0;

        while (r < nums.length) {
            sum += nums[r];

            while (sum * (r - l + 1) >= k && l <= r) {
                sum -= nums[l];
                l++;
            }

            res += (r - l) + 1;
            r++;
        }

        return res;
    }
}

// https://leetcode.com/problems/count-subarrays-with-score-less-than-k/
