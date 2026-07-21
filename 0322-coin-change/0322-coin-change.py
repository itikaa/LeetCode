class Solution(object):
    def coinChange(self, coins, amount):
        """
        :type coins: List[int]
        :type amount: int
        :rtype: int
        """
        dp=[float('inf')]*(amount+1)
        dp[0]=0
        if amount==0:
            return 0

        min_coin=float('inf')
        for i in range(0,amount+1):
            
            for coin in coins:
                if coin<=i and dp[i-coin]!=float('inf'):
                    dp[i]=min(dp[i],1+dp[i-coin])
        if dp[amount]==float('inf'):
            return -1
        return dp[amount]

        