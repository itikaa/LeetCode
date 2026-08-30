class Solution(object):
    def minimumDeletions(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        n=len(nums)
        if(n<=2):
            return n
        MIN=float('inf')
        MAX=float('-inf')
        for i in range(n):
            if nums[i]<MIN:
                MIN=nums[i]
                m=i
            if nums[i]>MAX:
                MAX=nums[i]
                M=i
        if m>M:
            M,m=m,M
        return min( ((m+1)+(M-m)), ((m+1)+(n-M)) ,((n-M)+(M-m)) )
       



        