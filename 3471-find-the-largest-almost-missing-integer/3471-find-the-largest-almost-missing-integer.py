class Solution(object):
    def largestInteger(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        n=len(nums)
        # if(len(nums)<=k):
        #     return max(nums)

        freq={}
        ans=-1
        for i in nums:
            if i in freq:
                freq[i]+=1
            else:
                freq[i]=1
        
        if k==1:
            for key in freq:
                if freq[key]==1:
                    ans=max(ans,key)
        
        elif k==len(nums):
            return max(nums)
        else:
            if freq[nums[0]]==1 and freq[nums[-1]]==1:
                ans=max(ans,nums[0],nums[-1])
                return ans
            elif freq[nums[0]]==1:
                     ans=max(ans,nums[0])
            elif freq[nums[n-1]]==1:
                    ans=max(ans,nums[n-1])
            
        return ans
    
        
        
        