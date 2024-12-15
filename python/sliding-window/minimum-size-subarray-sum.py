class Solution:
    def minSubArrayLen(self, target: int, nums: List[int]) -> int:
        l = 0
        ans = math.inf
        running_total = 0

        for r in range(len(nums)):

            running_total += nums[r]

            while running_total >= target:
                ans = min(ans, r - l + 1)
                running_total -= nums[l]
                l += 1



        if ans == math.inf:
             return 0
        else: 
            return ans
