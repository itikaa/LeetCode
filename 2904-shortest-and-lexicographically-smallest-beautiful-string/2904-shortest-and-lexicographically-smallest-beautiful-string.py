class Solution(object):
    def shortestBeautifulSubstring(self, s, k):
        """
        :type s: str
        :type k: int
        :rtype: str
        """
        l=0
        r=0
        n=len(s)
        result=""
        count=0
        ans=float('inf')
        for r in range(len(s)):
            c=s[r]
            if(c=='1'):
                count+=1

            while(count>k):
                ch=s[l]
                if ch=='1':
                    count-=1
                l+=1

            if count==k:
                while s[l]=='0' and l<=r:
                    l+=1

                check=s[l:r+1]

                if( result=="" or len(check)<len(result) or  (len(check)==len(result) and check<result)):
                  result=check

        return result

