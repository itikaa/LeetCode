class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        seen=set()
        l=0
        ans=0
        for r in range(0,len(s)):
            while s[r] in seen:
                seen.remove(s[l])
                l+=1
            seen.add(s[r])
            ans=max(ans,r-l+1)
        return ans

            
       
    
        