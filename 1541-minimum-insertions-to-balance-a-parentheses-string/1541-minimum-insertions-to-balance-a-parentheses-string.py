class Solution(object):
    def minInsertions(self, s):
        """
        :type s: str
        :rtype: int
        """
        st=[]
        i=0
        ans=0
        while i<len(s):
            ch=s[i]
            if ch=='(':
                st.append(s[i])
            else:
              if not st:
                ans+=1
                if (i+1)<len(s) and s[i+1]==')':
                    i+=1
                else:
                    ans+=1
                
              else:
                if i+1<len(s) and s[i+1]==')':
                    i+=1
                else:
                    ans+=1
                st.pop()
              
            i+=1
        return ans+(len(st))*2

            
            

        