class Solution(object):
    directions=[(-1,0),(1,0),(0,1),(0,-1)]
    
    def numIslands(self, grid):
        """
        :type grid: List[List[str]]
        :rtype: int
        """
        m=len(grid)
        n=len(grid[0])
        visited=[[False]*n for i in range(m)]
        count=0
        for i in range(m):
            for j in range(n):
                if(grid[i][j]=='1' and visited[i][j]==False):
                    self.dfs(i,j,grid,visited,m,n)
                    count+=1
        return count

        

    def dfs(self,r,c,grid,visited,m,n):
        if(r<0 or c<0 or r>=m or c>=n or grid[r][c]=='0' or visited[r][c]==True):
            return
        visited[r][c]=True
        for dx,dy in self.directions:
            self.dfs(r+dx,c+dy,grid,visited,m,n)
             


        