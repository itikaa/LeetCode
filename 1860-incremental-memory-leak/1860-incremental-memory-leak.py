class Solution(object):
    def memLeak(self, memory1, memory2):
        """
        :type memory1: int
        :type memory2: int
        :rtype: List[int]
        """
        i=1
        ans=[0]*3
        while(i<=memory1 or i<=memory2):
            if(memory1>=memory2):
                if i<=memory1:
                  memory1-=i
            else:
                if i<=memory2:
                    memory2-=i
            i+=1
        ans[0]=i
        ans[1]=memory1
        ans[2]=memory2
        return ans
                


        