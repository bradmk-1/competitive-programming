class Solution:
    def maxArea(self, heights: List[int]) -> int:
        
        l = 0
        r = len(heights) - 1

        most_water = (r - l) * min(heights[l], heights[r])

        while (l < r):

            if (heights[l] < heights[r]):
                l += 1
            elif (heights[r] <= heights[l]):
                r -= 1

            most_water = max(most_water, min(heights[l], heights[r]) * (r - l))

        return most_water

            

# https://leetcode.com/problems/container-with-most-water
# Typical two pointer, calculate max area by taking lowest side and total of numbers between two indexes, then times that by lowest side.
# Increment / decincrement pointers based on what's lower / higher