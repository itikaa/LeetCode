class Solution(object):
    def numSquares(self, n):
        """
        :type n: int
        :rtype: int
        """
        dp=[float('inf')]*(n+1)
        dp[0]=0
        square=[]
        if n==1:
            return 1
        for i in range(1,(n/2)+1):
            if i*i<=n:
                square.append(i*i)
            else:
                break
        for i in range(1,n+1):
            for sq in square:
                if sq<=i and dp[i-sq]!=float('inf'):
                    dp[i]=min(dp[i],1+dp[i-sq])
        if dp[n]==float('inf'):
            return -1
        return dp[n]


        