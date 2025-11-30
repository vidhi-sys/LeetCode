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
        if(n==1&head.next==null){
            return null;
        }
        int len=0;
        ListNode temp=head;
        while(temp!=null){
            len+=1;
            temp=temp.next;
        }
        int pos=len-n;
       int  len2=0;
       if (pos == 0) {
            return head.next;
        }
      ListNode temp2=head;
         while(temp2!=null){
            if(len2+1==pos){
                temp2.next=temp2.next.next;

            }
            len2++;

            temp2=temp2.next;
        }

return head;
        
    }
}