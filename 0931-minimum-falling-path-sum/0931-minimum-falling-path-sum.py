class Solution(object):
    def minFallingPathSum(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: int
        """
        m=len(matrix)
        n=len(matrix[0])
        dp=[[0]*n for i in range(m)]
        for j in range(n):
            dp[0][j]=matrix[0][j]
            
        for i in range(1,m):
            for j in range(n):
                sum=matrix[i][j]+dp[i-1][j]
                if(j-1>=0):
                    sum=min(sum,matrix[i][j]+dp[i-1][j-1])
                if (j+1<n):
                    sum=min(sum,matrix[i][j]+dp[i-1][j+1])
                dp[i][j]=sum
        ans=float('inf')
        for j in range(n):
            ans=min(dp[m-1][j],ans)
        return ans
                    
                
        