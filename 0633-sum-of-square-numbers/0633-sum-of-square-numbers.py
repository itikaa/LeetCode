class Solution(object):
    def judgeSquareSum(self, c):
        """
        :type c: int
        :rtype: bool
        """
        a=0
        b=int(math.sqrt(c))
        while(a<=b):
            check=pow(a,2)+b**2
            if check==c:
                return True
            elif check<c:
                a+=1
            else:
                b-=1
        return False

        