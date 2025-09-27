class Solution {
    public int findDuplicate(int[] nums) {
        int slow = 0, fast = 0;

        for (;;) {
            // property of integer ranges effectively makes index a linked list 
            slow = nums[slow];
            fast = nums[nums[fast]];

            if (slow == fast) {
                break;
            };
        }

        int cycle = 0;

        for (;;) {
            slow = nums[slow];
            cycle = nums[cycle];

            if (slow == cycle) {
                return cycle;
            }
        }

    }
}

// https://leetcode.com/problems/find-the-duplicate-number/
