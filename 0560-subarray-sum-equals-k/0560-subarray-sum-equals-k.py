class Solution(object):
    def subarraySum(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        freq={}
        n=len(nums)
        sum=0
        ans=0
        for i in range(0,n):
            sum+=nums[i]
            if(sum==k):
                ans+=1
            if((sum-k)in freq):
                ans+=freq[sum-k]
            freq[sum]=freq.get(sum,0)+1
        return ans
