class Solution(object):
    def findAnagrams(self, s, p):
        """
        :type s: str
        :type p: str
        :rtype: List[int]
        """
        s_count=[0]*26
        p_count=[0]*26
        result=[]
        for i in p:
            p_count[ord(i)-ord('a')]+=1

        for j in range(0,len(s)):
            s_count[ord(s[j])-ord('a')]+=1
            
            if j>=len(p):
                s_count[ord(s[j-len(p)])-ord('a')]-=1
            if p_count==s_count:
                result.append(j-len(p)+1)
        return result

        