class Solution:
    def carFleet(self, target: int, position: List[int], speed: List[int]) -> int:
        stack = []
        pos_speed = list(sorted(zip(position, speed), key = lambda x: x[0], reverse = True))

        for i in pos_speed:
            stack.append((target - i[0]) / i[1])
            
            if len(stack) >= 2 and stack[-1] <= stack[-2]:
                stack.pop()

        return len(stack)


# https://leetcode.com/problems/car-fleet/
