class Solution(object):
    def rob(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        n=len(nums)
        if(n==1):
            return nums[0]
        return max(self.check(nums,1,n-1), self.check(nums,0,n-2))
    

    def check(self,nums,start,end):
         n = end - start + 1

         if n == 1:
           return nums[start]

         dp = [-1] * n
         dp[0] = nums[start]
         dp[1] =  nums[start + 1]
         ans=max(dp[0],dp[1])
         for i in range(2, n):
            if(i-3)>=0:
                dp[i] = max(dp[i - 2], dp[i - 3] )+ nums[start+i]
            else:
                dp[i]=nums[start+i]+dp[i-2]

            ans=max(dp[i],ans)
         return ans

 

    
        