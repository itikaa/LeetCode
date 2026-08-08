class Solution(object):
    def findLUSlength(self, a, b):
        """
        :type a: str
        :type b: str
        :rtype: int
        """
        ans=0
        s1=""
        s2=""
        ans=-1
        for i in range(0,len(a)):
            for j in (i,len(a)):
              s1=a[i:j+1]
              if(s1 not in b):
                ans=max(ans,len(s1))
        for i in range(0,len(b)):
            for j in (i,len(b)):
              s2=b[i:j+1]
              if(s2 not in a):
                ans=max(ans,len(s2))
        return ans
        


        