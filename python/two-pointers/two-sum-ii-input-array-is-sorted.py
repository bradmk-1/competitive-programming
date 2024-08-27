class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        left_ptr = 0
        right_ptr = len(numbers) - 1

        while left_ptr < right_ptr:
            ntf = target - numbers[right_ptr]
            combo = numbers[left_ptr] + numbers[right_ptr]
            if (combo > target):
                right_ptr -= 1
            elif (combo < target):
                left_ptr += 1
            else:
                return [left_ptr + 1, right_ptr + 1]


# https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
