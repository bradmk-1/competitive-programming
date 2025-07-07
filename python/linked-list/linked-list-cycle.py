# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:

        fast, slow = head, head
        itr = 0
        while fast and fast.next:
            itr += 1
            print(f'this is iteration {itr}')
            slow = slow.next
            fast = fast.next.next

            if slow == fast:
                return True

        return False

# https://leetcode.com/problems/linked-list-cycle
