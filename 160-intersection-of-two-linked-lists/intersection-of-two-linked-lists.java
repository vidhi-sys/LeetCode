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
        
        HashMap<ListNode,Integer>mp=new HashMap<>();
        while(p1!=null){
            mp.put(p1,1);
            p1=p1.next;
        }
         while(p2!=null){
           if(mp.containsKey(p2)){
            return p2;
           }
            p2=p2.next;
        }
        
        
        return null; // Either intersection node or null
    }
}