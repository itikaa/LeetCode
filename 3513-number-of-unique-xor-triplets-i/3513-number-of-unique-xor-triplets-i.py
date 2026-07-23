class Solution(object):
    def uniqueXorTriplets(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        n=len(nums)
        if n<=2:
            return n
        bits= self.bit_len(n)
        return 2**bits

    def bit_len(self,N):
        if N==0:
            return 1
        count=0
        while N>0:
            count+=1
            N>>=1
        return count

       
        