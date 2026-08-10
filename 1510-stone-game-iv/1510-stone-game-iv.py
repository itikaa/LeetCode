class Solution(object):
    def winnerSquareGame(self, n):
        """
        :type n: int
        :rtype: bool
        """
        dp=[-1]*(n+1)
        return self.solve(n,dp)


    def solve(self,n,dp):
        if(n==0 ):
            return False
        if dp[n] != -1:
            return dp[n]
        for k in range(1, int(n**0.5) + 1):
                if self.solve(n-k*k,dp)==False :
                    dp[n]=True
                    return True
        dp[n]=False
        return False
            
            
        