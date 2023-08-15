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
    public ListNode partition(ListNode head, int x) {
        ListNode leftHead=new ListNode();
        ListNode rightHead=new ListNode();
        ListNode left=leftHead;
        ListNode right=rightHead;

        while(head!=null){
            if(head.val<x){
                left.next=new ListNode(head.val);
                left=left.next;
            }
            else{
                right.next=new ListNode(head.val);
                right=right.next;
            }
            head=head.next;
        }
        left.next=rightHead.next;
        return leftHead.next;
        
    }
}
