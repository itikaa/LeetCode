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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode h1=Reverse(l1);
        ListNode h2=Reverse(l2);
        int sum=0;
        int carry=0;
        ListNode ans=new ListNode(0);
        ListNode result=ans;
        while(h1!=null && h2!=null){
          sum=h1.val+h2.val+carry;
          carry=sum/10;
          ans.next=new ListNode(sum%10);
          ans=ans.next;
          h1=h1.next;
          h2=h2.next;
        }

        while(h1!=null){
            sum=h1.val+carry;
            ans.next=new ListNode(sum%10);
            carry=sum/10;
            ans=ans.next;
            h1=h1.next;
        }

        while(h2!=null){
            sum=h2.val+carry;
            carry=sum/10;
            ans.next=new ListNode(sum%10);
            ans=ans.next;
            h2=h2.next;
        }
        if(carry!=0){
            ans.next=new ListNode(carry);
            ans=ans.next;
        }
        return Reverse(result.next);

    }

    public ListNode Reverse(ListNode h){
        ListNode prev=null;
        ListNode n=null;
        ListNode curr=h;
        while(curr!=null){
            n=curr.next;
            curr.next=prev;
            prev=curr;
            curr=n;
        }
        return prev;
    }
}