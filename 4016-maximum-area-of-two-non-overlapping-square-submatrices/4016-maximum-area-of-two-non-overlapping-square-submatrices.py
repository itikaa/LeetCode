class Solution(object):
    def maxArea(self, mat):
        """
        :type mat: List[List[int]]
        :rtype: int
        """
        m=len(mat)
        n=len(mat[0])
        dp=[[0]*(n+1) for i in range (m+1)]
        for i in range(m-1,-1,-1):
            for j in range(n-1,-1,-1):
                if mat[i][j]==1:
                    dp[i][j]=1+min(dp[i+1][j],dp[i][j+1],dp[i+1][j+1])
        
        low=1
        ans=0
        high=min(m,n)
        while(low<=high):
            mid=(low+high)/2
            if self.possible(mid,dp,m,n):
                ans=mid
                low=mid+1
            else:
                high=mid-1
        return ans*ans
        
    def possible(self,k,dp,m,n):
        r_min=m
        c_min=n
        c_max,r_max=-1,-1
        for i in range (m):
            for j in range (n):
                if dp[i][j]>=k:
                    r_min=min(r_min,i)
                    r_max=max(r_max,i)
                    c_min=min(c_min,j)
                    c_max=max(c_max,j)
        if r_min!=m and r_max!=-1 and (r_max-r_min)>=k:
            return True
        if c_min!=n and c_max!=-1 and (c_max-c_min)>=k:
            return True
        return False
    


                

                
        