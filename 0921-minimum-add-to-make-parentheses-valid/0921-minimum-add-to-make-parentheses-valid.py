class Solution(object):
    def minAddToMakeValid(self, s):
        """
        :type s: str
        :rtype: int
        """
        count1=0
        count2=0
        for i in s:
            if i=='(':
                count1+=1
            else:
                if count1>0:
                    count1-=1
                else:
                    count2+=1
        return abs(count1+count2)
        