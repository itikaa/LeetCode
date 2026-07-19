class Solution(object):
    def smallestSubsequence(self, s):
        """
        :type s: str
        :rtype: str
        """
        stack=[]
        last_index=[-1]*26
        for i in range(0,len(s)):
            last_index[ord(s[i])-ord('a')]=i
        stack.append(s[0])

        check=set()
        check.add(s[0])

        for i in range(1,len(s)):
            if s[i] in check:
                continue
            while( stack and (ord(s[i])<ord(stack[-1])) and last_index[ord(stack[-1])-ord('a')]>i  ):
                check.remove(stack[-1])
                stack.pop()
            check.add(s[i])
            stack.append(s[i])

        return "".join(stack)