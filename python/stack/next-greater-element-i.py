class Solution:
    def nextGreaterElement(self, nums1: List[int], nums2: List[int]) -> List[int]:
        res = []
        stack = []
        next_greater_element = {}
        
        # Iterate each number in nums2
        for n in nums2:
            # If stack isn't empty, and current num is greater than the top of our stack, 
            # set mapping of top of stack to current num
            while stack and n > stack[-1]:
                print(stack)
                print(f'stack printed above, n = {n} and top of stack is {stack[-1]}')
                next_greater_element[stack.pop()] = n
            # always add current num to top of stack
            stack.append(n)

        for n in stack:
            next_greater_element[n] = -1

        for i in nums1:
            res.append(next_greater_element[i])

        return res


# https://leetcode.com/problems/next-greater-element-i/
# solving this makes daily temperature and other monotonic stack questions easy


            



        
        
