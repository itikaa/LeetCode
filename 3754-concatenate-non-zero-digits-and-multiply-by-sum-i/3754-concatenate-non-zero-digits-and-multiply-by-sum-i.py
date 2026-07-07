class Solution(object):
    def sumAndMultiply(self, n):
        """
        :type n: int
        :rtype: int
        """
        a=""
        sum=0
        s=str(n)
        for c in s:
            sum+=int(c)
            if c!='0':
                a+=c
        
        if not a:
            return 0
        num= int(a)
        return num*sum

        
        