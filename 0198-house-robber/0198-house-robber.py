class Solution(object):
    def rob(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        n=len(nums)
        dp=[-1]*n
        dp[0]=nums[0]
        if n==1:
            return nums[0]
        dp[1]=nums[1]
        ans=max(dp[0],dp[1])
        for i in range(2,n):
            if (i-3)>=0:
                dp[i]=nums[i]+max(dp[i-2],dp[i-3])
            else:
                dp[i]=nums[i]+dp[i-2]
            ans=max(dp[i],ans)
        return ans
            
        