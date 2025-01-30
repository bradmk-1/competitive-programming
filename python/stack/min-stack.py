class MinStack:

    def __init__(self):
        self.stack = []

    def push(self, val: int) -> None:
        to_push = val if len(self.stack) == 0 else min(val, self.stack[-1][1])
        self.stack.append((val, to_push))
        

    def pop(self) -> None:
        self.stack.pop()
        

    def top(self) -> int:
        return self.stack[-1][0]
        

    def getMin(self) -> int:
        return self.stack[-1][1]
        


# https://leetcode.com/problems/min-stack/