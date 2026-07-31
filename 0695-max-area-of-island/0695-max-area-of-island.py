class Solution(object):
    Directions=[(-1,0),(1,0),(0,-1),(0,1)]
    def maxAreaOfIsland(self, grid):
        """
        :type grid: List[List[int]]
        :rtype: int
        """
        m=len(grid)
        n=len(grid[0])
        visited=[[False]*n for i in range(m)]
        ans=0
        for i in range(m):
            for j in range(n):
                if(grid[i][j]==1 and visited[i][j]==False):
                    ans=max(ans,self.dfs(i,j,visited,grid,m,n))
        return ans


    def dfs(self,r,c,visited,grid,m,n):
        if r<0 or c<0 or r>=m or c>=n or visited[r][c]==True or grid[r][c]==0:
            return 0
        visited[r][c]=True
        count=1
        
        for dx,dy in self.Directions:
            count+=self.dfs(r+dx,c+dy,visited,grid,m,n)
        return count
            

        
        