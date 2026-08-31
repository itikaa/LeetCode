# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def nodesBetweenCriticalPoints(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: List[int]
        """
        critical=[]
        prev=head
        curr=head.next
        i=2
        ans=[-1,-1]
        first=-1
        last=-1
        min_dist=float('inf')
        while curr and curr.next:
            if (curr.val<prev.val and curr.val<curr.next.val) or (curr.val>prev.val and curr.val>curr.next.val):
                critical.append(i)

            
                if first == -1:
                    first = i
                    last = i
                else:
                    min_dist = min(min_dist, i- last)
                    last = i
            prev=curr
            curr=curr.next
            i+=1

        n=len(critical)
        if n<2:
                return ans
        ans[0]=min_dist
        ans[1]=critical[n-1]-critical[0]
        return ans
        
            

            
        

        