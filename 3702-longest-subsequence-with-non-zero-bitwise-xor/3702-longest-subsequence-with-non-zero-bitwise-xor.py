class Solution(object):
    def longestSubsequence(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        xor=0
        flag=False
        n=len(nums)
        for i in range(n):
            if nums[i]>0:
                flag=True
            xor^=nums[i]
        if not flag:
            return 0
        if xor>0:
            return n
        return n-1
        