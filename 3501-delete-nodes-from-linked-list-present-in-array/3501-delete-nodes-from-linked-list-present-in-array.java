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
    public ListNode modifiedList(int[] nums, ListNode head) {
        int n=nums.length; int max=0;
        for(int i:nums){max=Math.max(max,i);}
        ListNode temp=new ListNode();
        ListNode newList=temp;
        boolean[] check=new boolean[max+1];
        for(int i:nums){check[i]=true;}
        while(head!=null){
            if( head.val>=max+1 || check[head.val]==false){
                temp.next=head;
                temp=temp.next;
            }
            head=head.next;
        }
        temp.next=null;
        return newList.next;
    }
}