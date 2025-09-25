/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        var dummy = new ListNode(-1, head);
        var curr = dummy;

        Set<Integer> numsLookup = Arrays.stream(nums).boxed().collect(Collectors.toSet());


        while (curr.next != null) {
            if (numsLookup.contains(curr.next.val)) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            } 
        };

        return dummy.next;
    }
}


// https://leetcode.com/problems/delete-nodes-from-linked-list-present-in-array
