class Solution:
    def minOperations(self, logs: List[str]) -> int:
        count = 0

        for i in logs:
            if count > 0 and i == "../":
                count -= 1
            if i != "./" and i != "../":
                count += 1

        return count

# https://leetcode.com/problems/crawler-log-folder
