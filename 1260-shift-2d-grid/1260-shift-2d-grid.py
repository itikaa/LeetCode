class Solution(object):
    def shiftGrid(self, grid, k):
        """
        :type grid: List[List[int]]
        :type k: int
        :rtype: List[List[int]]
        """
        m=len(grid)
        n=len(grid[0])
        size=m*n
        id=0
        temp=[-1]*size
        for i in range(0,m):
            for j in range(0,n):
                temp[id]=grid[i][j]
                id+=1
        
        id=0

        ans=[]
        for i in range(0,m):
            t=[]
            for j in range(0,n):
                idx=((id-k)%size+size)%size
                t.append(temp[idx])
                id+=1
            ans.append(t)
        return ans
                

        