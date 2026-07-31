class Solution(object):
    Directions=[(-1,0),(1,0),(0,-1),(0,1)]
    def islandPerimeter(self, grid):
        """
        :type grid: List[List[int]]
        :rtype: int
        """
        m=len(grid)
        n=len(grid[0])
        ans=0
        for i in range(m):
            for j in range(n):
                if grid[i][j]==1:
                    count=4
                    for dx,dy in self.Directions:
                        nr=i+dx
                        nc=j+dy
                        if(nr>=0 and nc>=0 and nr<m and nc<n):
                            if grid[nr][nc]==1:
                                count-=1
                    ans+=count
        return ans


        