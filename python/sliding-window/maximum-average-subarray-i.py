class Solution:
    def findMaxAverage(self, nums: List[int], k: int) -> float:
        max_sub_arr = -inf
        curr_sub_arr = 0

        for i in range(len(nums)):
            curr_sub_arr += nums[i]
            
            if (i >= k - 1):
                max_sub_arr = max(max_sub_arr, curr_sub_arr / k)
                curr_sub_arr -= nums[i - (k - 1)]



        return max_sub_arr