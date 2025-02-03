class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        stack = []

        for t in tokens:
            if t == '+':
                stack.append(stack.pop() + stack.pop())
            elif t == '-':
                first, second = stack.pop(), stack.pop()
                stack.append(second - first)
            elif t == '/':
                first, second = stack.pop(), stack.pop()
                stack.append(math.trunc(second / first))
            elif t == '*':
                stack.append(stack.pop() * stack.pop())
            else:
                stack.append(int(t))

        return stack[0]
        

# https://leetcode.com/problems/evaluate-reverse-polish-notation/
