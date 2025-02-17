class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        days_until_greater_temp = [0] * len(temperatures)
        stack = []

        for i, t in enumerate(temperatures):
            while stack and t > temperatures[stack[-1]]:
                day = stack.pop()
                days_until_greater_temp[day] = i - day
            stack.append(i)
        
        return days_until_greater_temp       


# https://leetcode.com/problems/daily-temperatures/
