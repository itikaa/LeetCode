class Solution(object):
    def stoneGameII(self, piles):
        """
        :type piles: List[int]
        :rtype: int
        """
        n=len(piles)
        dp = [[[-1 for _ in range(101)] for _ in range(101)] for _ in range(2)]
        return self.solveForAlice(piles,1,0,1,dp)
    
    def solveForAlice(self,piles,person,i,M,dp):
        n=len(piles)
        if i>=n:
            return 0
        if dp[person][i][M]!=-1:
            return dp[person][i][M]
        result = -1 if person == 1 else float('inf')
        stones=0
        for x in range(1,min(2*M,n-i)+1):
            stones+=piles[i+x-1]
            #Alice
            if person==1:
                result=max(result,stones+ self.solveForAlice(piles,0,i+x,max(M,x),dp))
            else:
                result=min(result, self.solveForAlice(piles,1,i+x,max(M,x),dp))
        dp[person][i][M]=result
        return result


        