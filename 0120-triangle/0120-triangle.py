class Solution(object):
    def minimumTotal(self, triangle):
        """
        :type triangle: List[List[int]]
        :rtype: int
        """
        N=len(triangle)
        n=len(triangle[-1])
        front=triangle[-1][:]
        curr=[-1]*n
        for i in range(N-2,-1,-1):
            for j in range(0,len(triangle[i])):
                left= triangle[i][j] + front[j]
                right= triangle[i][j] + front[j+1]
                curr[j]=min(left,right)
            front=curr
        return front[0]

           
        