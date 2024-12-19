class Solution:
    def totalFruit(self, fruits: List[int]) -> int:
        fruit_count = {}
        l = 0

        max_fruits = 0
        for r in range(len(fruits)):
            if fruits[r] in fruit_count:
                fruit_count[fruits[r]] += 1
            else:
                fruit_count[fruits[r]] = 1

            
            while len(fruit_count) > 2:
                if fruit_count[fruits[l]] == 1:
                    del fruit_count[fruits[l]]
                else:
                    fruit_count[fruits[l]] -= 1
                l += 1

            max_fruits = max(max_fruits, r - l + 1)

            
        return max_fruits





# https://leetcode.com/problems/fruit-into-baskets/
# Can only pick two different types of fruit

        