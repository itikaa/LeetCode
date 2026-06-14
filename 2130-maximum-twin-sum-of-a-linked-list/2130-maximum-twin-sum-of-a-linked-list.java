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
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        //reverse the second half of the list 
        ListNode prev=null;
        ListNode curr=slow;
        while(curr!=null){
            ListNode n=curr.next;
            curr.next=prev;
            prev=curr;
            curr=n;
        }
       
        int max=0;
       int sum=0;
        while(prev!=null){
              sum= head.val+prev.val;
              prev=prev.next;
              head=head.next;
              max=Math.max(max,sum);
              sum=0;
        }
        return max;
    }
}