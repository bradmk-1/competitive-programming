# The guess API is already defined for you.
# @param num, your guess
# @return -1 if num is higher than the picked number
#          1 if num is lower than the picked number
#          otherwise return 0
# def guess(num: int) -> int:

class Solution:
    def guessNumber(self, n: int) -> int:
        l, r = 0, n

        while l <= r:
            mid = (l + r) // 2

            if guess(mid) == 0:
                return mid
            
            if guess(mid) == 1:
                l = mid + 1
            else:
                r = mid - 1

# https://leetcode.com/problems/guess-number-higher-or-lower/
