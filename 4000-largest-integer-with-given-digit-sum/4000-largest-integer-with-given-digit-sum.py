class Solution(object):
    def largestInteger(self, n, s):
        """
        :type n: int
        :type s: int
        :rtype: int
        """
        if(n*9<s):
            return -1
        if(s==0):
            return 0

        result=[]
        for i in range(n):
            digit=min(9,s)
            result.append(str(digit))
            s-=digit
        return int(''.join(result))





        