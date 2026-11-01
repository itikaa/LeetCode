class Solution(object):
    def minMoves(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        n=len(nums)
        return sum(nums)-n*min(nums)
        