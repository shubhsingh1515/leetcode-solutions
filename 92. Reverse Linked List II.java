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

    public ListNode reverseBetween(ListNode head, int left, int right) {

        if (head == null || left == right) {
            return head;
        }

        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode beforeLeft = dummy; 

        for (int i = 0; i < left - 1; i++) {
            beforeLeft = beforeLeft.next;
        }

        ListNode prev = null;
        ListNode curr = beforeLeft.next;
        ListNode next = null;

        for (int i = 0; i <= right - left; i++) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        beforeLeft.next.next = curr;
        beforeLeft.next = prev;

        return dummy.next;
    }
}
