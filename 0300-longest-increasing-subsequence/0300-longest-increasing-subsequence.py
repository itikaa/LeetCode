class Solution(object):
    def lengthOfLIS(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        temp=[0]*len(nums)
        size=0
        for x in nums:
            i=0
            j=size
            while i!=j:
                mid=(i+j)/2
                if temp[mid]<x:
                    i=mid+1
                else:
                    j=mid
            temp[i]=x
            size=max(i+1,size)
        return size
              



        