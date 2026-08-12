class Solution(object):
    def maxSubarrayLength(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        freq={}
        ans=float('-inf')
        n=len(nums)
        l=0
        for r in range(0,n):
            ele=nums[r]
            freq[ele]=freq.get(ele,0)+1
            while freq[ele]>k and l<r:
                freq[nums[l]]-=1
                l+=1
            ans=max(ans,r-l+1)  
        return ans     