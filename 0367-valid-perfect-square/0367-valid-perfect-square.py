class Solution(object):
    def isPerfectSquare(self, num):
        """
        :type num: int
        :rtype: bool
        """
        if num==1:
            return True
        low=1
        high=num/2
        while low<=high:
            mid=low+(high-low)/2
            square=mid*mid
            if square==num:
                return True
            elif square<num:
                low=mid+1
            else:
                high=mid-1
        return False
        