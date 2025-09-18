class Solution {
    public int gdc(int a, int b){
        if(b==0) return a;
        return gdc(b, a%b);
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
         
         ListNode temp = head;

         while(temp.next!=null){
            ListNode node = new ListNode(gdc(temp.val, temp.next.val));
            node.next = temp.next;
            temp.next = node;
            temp = temp.next.next;
         }

         return head;
    }
}
