class Solution:
    def findMin(self, nums: List[int]) -> int:
        l = 0
        r = len(nums) - 1

        while l < r:
            mid = (l + r) // 2
            print(f'mid is {mid}')

            if nums[mid] >= nums[r]:
                l = mid + 1
            else:
                r = mid
                

        return nums[l]
  
  


# https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/
