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
    public int pairSum(ListNode head) {
       
        
        int j=0;
        ListNode temp=head;
        ArrayList<Integer>list=new ArrayList<>();
        while(temp!=null){
            list.add(temp.val);
            j=j+1;
            temp=temp.next;
        }
        int twin_sum=0;
        int a=0;
        int b=list.size()-1;
        while(a<b){
           int  sum=list.get(a)+list.get(b);
            twin_sum=Math.max(twin_sum,sum);
            a++;
            b--;
        }

return twin_sum;
        
    }
}