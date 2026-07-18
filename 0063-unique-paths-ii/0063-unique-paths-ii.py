class Solution(object):
    def uniquePathsWithObstacles(self, obstacleGrid):
        """
        :type obstacleGrid: List[List[int]]
        :rtype: int
        """
        m=len(obstacleGrid)
        n=len(obstacleGrid[0])

        if(obstacleGrid[0][0]==1):
             return 0
        
        grid=[[0]*n for i in range(m)]

        if(m==1 and n==1):
            return 1
        for i in range(1,m):
            if(obstacleGrid[i][0]!=1):
                  grid[i][0]=1
            else:
                break
        for j in range(1,n):
             if(obstacleGrid[0][j]!=1):
                grid[0][j]=1
             else:
                break

        for i in range (1,m):
            for j in range (1,n):
                if(obstacleGrid[i][j]!=1):
                     if(obstacleGrid[i-1][j]!=1):
                        grid[i][j]+=grid[i-1][j]
                     if (obstacleGrid[i][j-1]!=-1):
                        grid[i][j]+=grid[i][j-1]
        return grid[m-1][n-1]


        