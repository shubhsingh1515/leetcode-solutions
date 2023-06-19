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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr=head;
        int size=0;
        while(curr!=null){
            curr=curr.next;
            size++;
        }
        if(n==size){
            head=head.next;
            return head;
        }
        int k=size-n;
        int i=1;
         ListNode temp=head;
        while(i<k){
            temp=temp.next;
            i++;
        }
        temp.next=temp.next.next;
        return head;
    }
}
