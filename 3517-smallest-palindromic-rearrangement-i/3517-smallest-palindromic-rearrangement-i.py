class Solution(object):
    def smallestPalindrome(self, s):
        """
        :type s: str
        :rtype: str
        """
        freq=[0]*26
        ans=""
        one=""
        for ch in s:
            idx=ord(ch)-ord('a')
            freq[idx]+=1
        for i in range(26):
            if(freq[i]%2!=0):
                one+=chr(i+ord('a'))

            add=freq[i]/2
            ans+=chr(i+ord('a'))*add
        if(len(one)==0):
            result=ans+ans[::-1]
        else:
            result=ans+one[0]+ans[::-1]
        return result


        