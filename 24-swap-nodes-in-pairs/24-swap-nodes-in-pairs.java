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
    public ListNode swapPairs(ListNode head) {
        if (head == null) {
		return head;
	}

	ListNode prev = head, cur = prev.next;  // prev is first item and cur is second item in the list
	while (cur != null) {
		int tmp = cur.val;                  // swap values using tmp variable
		cur.val = prev.val;
		prev.val = tmp;

		prev = cur.next;                    // update prev and cur 
		cur = prev == null ? null : prev.next;
	}
	return head;
        
    }
}