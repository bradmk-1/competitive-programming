class Solution:
    def minEatingSpeed(self, piles: List[int], h: int) -> int:

        l = 1
        r = max(piles)

        print(r)

        while l < r:
            mid = (l + r) // 2
            eating_rate = 0

            for pile in piles:
                eating_rate += math.ceil(float(pile) / mid)

            if eating_rate <= h:
                r = mid
            else:
                l = mid + 1

        return l


# https://leetcode.com/problems/koko-eating-banana
