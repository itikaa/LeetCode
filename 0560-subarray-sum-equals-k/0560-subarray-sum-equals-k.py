class Solution(object):
    def subarraySum(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        #nums.sort()
        l=0
        r=0
        n=len(nums)
        sum=0
        ans=0
        while(r<n):
            sum+=nums[r]
            while(l<r and (sum>k or sum<0)):
               sum-=nums[l]
               l+=1
            if(sum==k):
                ans+=1
            r+=1
        return ans
            


        