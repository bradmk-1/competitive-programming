# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def reorderList(self, head: Optional[ListNode]) -> None:

        # Find midpoint in LL
        fast, slow, prev = head, head.next, None

        while fast and fast.next:
            prev = slow
            slow = slow.next
            fast = fast.next.next

        if prev:
            prev.next = None


        list1, list2 = head, slow

        # Reverse second list (midpoint list)

        prev, curr = None, list2

        while curr:
            temp = curr.next
            curr.next = prev
            prev = curr
            curr = temp

        # Merge two lists

        first, second = list1, prev

        while second:
            temp1 = first.next
            temp2 = second.next

            first.next = second
            second.next = temp1

            first = temp1
            second = temp2


# https://leetcode.com/problems/reorder-list
