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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int len = 0;
        ListNode curr = head;
        while (curr != null) {
            len++;
            curr = curr.next;
        }
        
        int partSize = len / k;
        int extraNodes = len % k;
        
        ListNode[] res = new ListNode[k];
        curr = head;
        for (int i = 0; i < k && curr != null; i++) {
            res[i] = curr;
            int partLength = partSize + (extraNodes > 0 ? 1 : 0);
            for (int j = 0; j < partLength - 1; j++) {
                curr = curr.next;
            }
            ListNode next = curr.next;
            curr.next = null;
            curr = next;
            extraNodes--;
        }
        return res;
    }
}
