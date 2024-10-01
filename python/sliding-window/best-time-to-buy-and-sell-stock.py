class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        lowest = prices[0]
        max_prof = 0

        for price in prices:
            lowest = min(lowest, price)
            
            max_prof = max(max_prof, price - lowest)

        return max_prof



# https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
# Actually found pretty tricky as haven't done in a while, question
# is actually two pointers with the first pointer always being the lowest 
# value and being checked on each iteration.
            

            

        