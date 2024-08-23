class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:

        if len(nums) == 1:
             return 1

        num_exists = set(nums)

        maxCount = 0
        for i in num_exists:
            count = 1
            if(i - 1) not in num_exists:
                count = 0
                setVal = i
                while(setVal) in num_exists:
                    setVal += 1
                    count += 1
                maxCount = max(count, maxCount)


        return maxCount

            

# https://leetcode.com/problems/longest-consecutive-sequence
# Hard moved to medium, solution asks you not to sort (as it wants o(n), not o(n log n))
# To solve, cast array to set for lookup operations, then for each number, if it doesn't
# have a number before it, it is the start of a sequence, so forward search set.