class Solution {
    public long countSubarrays(int[] nums, int k) {
        int l = 0, r = 0;
        long res = 0;
        int numsMax = Arrays.stream(nums).max().getAsInt();
        int freq = 0;
        int len = nums.length;

        while (r < len) {
            if (nums[r] == numsMax) {
                freq++;
            }

            if (freq >= k) {
                while (freq >= k) {
                    res += len - r;

                    if (nums[l] == numsMax) {
                        freq--;
                    }
                    l++;
                }
            }

            r++;
        }

        return res;
    }
}

// https://leetcode.com/problems/count-subarrays-where-max-element-appears-at-least-k-times/
