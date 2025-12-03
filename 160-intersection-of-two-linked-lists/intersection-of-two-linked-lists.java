/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        
        ListNode p1 = headA;
        ListNode p2 = headB;
        int len1=getLength(headA);
        int len2=getLength(headB);
         int pos=Math.abs(len1-len2);
         for(int i=0;i<pos;i++){
            if(len1>len2){
                p1=p1.next;
             }
             else if (len2>len1 ){
                p2=p2.next;
             }

         }
         while(p1!=null&&p2!=null){
            if(p1==p2){
                return p2;
            }
            p1=p1.next;
            p2=p2.next;
         }
        
        
        
        return null; // Either intersection node or null
    }

  private int getLength(ListNode head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
    }
}