class Solution(object):
    def minimumPushes(self, word):
        """
        :type word: str
        :rtype: int
        """
        n=len(word)
        pushes=8
        i=2
        if(n<=8):
            return n
        n-=8
        while(n>0):
            if(n>=8):
                pushes+=(8*i)
                n-=8
            else:
              pushes+=(n*i)
              break
            i+=1
            
        return pushes


        