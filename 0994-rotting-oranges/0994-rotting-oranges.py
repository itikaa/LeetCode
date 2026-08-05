class Solution(object):
    directions=[(1,0),(-1,0),(0,1),(0,-1)]
    def orangesRotting(self, grid):
        """
        :type grid: List[List[int]]
        :rtype: int
        """
        m=len(grid)
        n=len(grid[0])
        fresh=0
        minutes=0
        q=deque()

        for i in range(m):
            for j in range(n):
                if grid[i][j]==1:
                    fresh+=1
                if grid[i][j]==2:
                    q.append((i,j))
        
        while (q and fresh>0):
            size=len(q)
            for i in range(size):
              r,c=q.popleft()
              for dx,dy in self.directions:
                nr=r+dx
                nc=c+dy
                if (nr>=0 and nr<m and nc>=0 and nc<n):
                    if(grid[nr][nc]==1):
                        q.append((nr,nc))
                        grid[nr][nc]=2
                        fresh-=1
            minutes+=1
        if (fresh==0):
            return minutes
        return -1


        