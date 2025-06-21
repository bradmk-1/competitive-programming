class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:#
        l, r = 0, len(nums) - 1

        if not nums:
            return [-1, -1]

        while l < r:
            mid = (l + r) // 2

            if nums[mid] < target:
                l = mid + 1
            else:
                r = mid

        if nums[l] != target:
            return [-1, -1]

        pivot, r = l, len(nums) - 1

        while l < r:
            mid = (l + r) // 2

            if nums[mid] == target and mid <= len(nums) - 1 and nums[mid + 1] != target:
                return [pivot, mid]

            if nums[mid] <= target:
                l = mid + 1
            else:
                r = mid

        return [pivot, l]

# https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array
