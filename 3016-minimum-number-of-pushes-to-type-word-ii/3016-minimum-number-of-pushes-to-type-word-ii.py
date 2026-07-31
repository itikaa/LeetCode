class Solution(object):
    def minimumPushes(self, word):
        """
        :type word: str
        :rtype: int
        """
        freq=[0]*26
        for ch in word:
            idx=ord(ch)-ord('a')
            freq[idx]+=1
        sum=0
        i=0
        freq.sort()
        for f in reversed(freq):
            if f==0:
                break
            sum+=f*((i//8)+1)
            i+=1
        return sum



        
        