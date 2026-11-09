class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer, Integer> curr = new HashMap<>();
        int res = 0;
        int l = 0, r = 0;

        while (r < nums.length) {
            curr.merge(nums[r], 1, Integer::sum);

            while (curr.get(nums[r]) > k) {
                curr.computeIfPresent(nums[l], (_, v) -> v == 1 ? null : v - 1);
                l++;
            }

            res = Math.max(res, r - l + 1);
            r++;
        }

        return res;
    }
}

// https://leetcode.com/problems/length-of-longest-subarray-with-at-most-k-frequency/
