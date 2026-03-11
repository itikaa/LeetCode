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
       int a= length(headA);
        int b=length(headB);
        if(a>=b){
            ListNode currA=traverse(headA,a-b);
            while(currA!=null){
                if(currA==headB){ return headB; }
                else{ currA=currA.next ; headB=headB.next;}
            }
        }
        else{
           ListNode currB= traverse(headB,b-a);
            while(currB!=null){
                if(currB==headA){ return headA; }
                else{ currB=currB.next ; headA=headA.next;}
            }
        }
        return null;
        
    }
    int length(ListNode head){
        int l=0;
        while(head!=null){
            head=head.next;
            l++;
        }
        return l;
    }
    ListNode traverse(ListNode head, int k){
        while(k>0){
            head=head.next;
            k--;
        }
        return head;
    }
}