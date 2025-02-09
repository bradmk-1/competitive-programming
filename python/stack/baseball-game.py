class Solution:
    def calPoints(self, operations: List[str]) -> int:
        processedOperations = []

        for i in operations:
            if i == '+':
                processedOperations.append(processedOperations[-1] + processedOperations[-2])
            elif i == 'D':
                processedOperations.append(processedOperations[-1] * 2)
            elif i == 'C':
                processedOperations.pop()
            else:
                processedOperations.append(int(i))
        
        return sum(processedOperations)


# https://leetcode.com/problems/baseball-game
