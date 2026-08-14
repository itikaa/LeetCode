class Solution(object):
    def maximumLengthSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        l=0
        r=0
        freq=[0]*26
        ans=float('-inf')
        while r<len(s):
            id=ord(s[r])-ord('a')
            freq[id]+=1
            while(freq[id]>2 and l<r):
                i=ord(s[l])-ord('a')
                freq[i]-=1
                l+=1
            ans=max(ans,r-l+1)
            r+=1
    
        return ans
    


        