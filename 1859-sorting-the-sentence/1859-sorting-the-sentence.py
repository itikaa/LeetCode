class Solution(object):
    def sortSentence(self, s):
        """
        :type s: str
        :rtype: str
        """
        list=s.split()
        ans=[""]*len(list)
        for i in list:
            n=len(i)
            index=int(i[-1])
            ans[index-1]=i[:-1]
        return " ".join(ans)

        