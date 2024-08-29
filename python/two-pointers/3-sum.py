class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        triplets = []

        for i, v in enumerate(nums):

            if (i > 0 and v == nums[i - 1]):
                continue

            lptr = i + 1
            rptr = len(nums) - 1

            while lptr < rptr:
                is_zero = v + nums[lptr] + nums[rptr]

                if (is_zero == 0):
                    triplets.append([v, nums[lptr], nums[rptr]])
                    lptr += 1
                    rptr -= 1
                    while nums[lptr] == nums[lptr - 1] and lptr < rptr:
                        lptr += 1
                elif(is_zero > 0):
                    rptr -= 1
                elif(is_zero < 0):
                    lptr += 1
        return triplets


# https://leetcode.com/problems/3sum/