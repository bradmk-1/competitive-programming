class Solution:
    def isValid(self, s: str) -> bool:

        if len(s) % 2 != 0:
            return False

        bracketMap = {']': '[', ')': '(', '}': '{'}
        bracketTracker = []

        for i in s:
            if i in { '(', '[', '{' }:
                bracketTracker.append(i)
            elif len(bracketTracker) != 0 and bracketTracker[-1] == bracketMap[i]:
                bracketTracker.pop()
            else:
                return False

        return False if len(bracketTracker) != 0 else True


# https://leetcode.com/problems/valid-parentheses/
        
        