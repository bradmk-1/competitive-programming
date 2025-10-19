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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        var curr = dummy;

        int carry = 0; 
        
        while (l1 != null || l2 != null || carry != 0) {
            int firstListVal = (l1 != null) ? l1.val : 0;
            int secondListVal = (l2 != null) ? l2.val : 0;

            // Add both values from list, plus the running carry total
            int sumOfLists = firstListVal + secondListVal + carry;
            
            // Divide by 10 to simulate carry rules in addition by hand
            carry = sumOfLists / 10;

            // If sum of l1 + l2, plus the running total of carry every
            // Surpasses 9, increment carry then take the remainder to add
            sumOfLists = sumOfLists % 10;

            curr.next = new ListNode(sumOfLists);

            //Increment lists
            curr = curr.next;
            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        
        }

        return dummy.next;
    }
}
