class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        l, r = 0, len(nums) - 1

        while l <= r:
            mid = (l + r) // 2

            if nums[mid] == target:
                return mid

            if nums[mid] <= target:
                l = mid + 1
            else:
                r = mid - 1


        return r + 1


# https://leetcode.com/problems/search-insert-position
