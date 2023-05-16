/**
 * https://leetcode.com/problems/merge-two-sorted-lists
 * 
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} list1
 * @param {ListNode} list2
 * @return {ListNode}
 */
const mergeTwoLists = (list1, list2) => {
    const mergedList = new ListNode(null);
    let listPtr = mergedList;
    
    while(list1 && list2) {
        if (list1.val <= list2.val) {
            listPtr.next = list1;
            listPtr = list1;
            list1 = list1.next;
        } else {
            listPtr.next = list2;
            listPtr = list2;
            list2 = list2.next;
        }
    };
    
    if (!list1) listPtr.next = list2;
    if (!list2) listPtr.next = list1;

    return mergedList.next;
};