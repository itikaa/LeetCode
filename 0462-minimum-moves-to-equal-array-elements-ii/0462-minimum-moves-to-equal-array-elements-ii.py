class Solution(object):
    def minMoves2(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        nums.sort()
        n=len(nums)
        median=nums[n/2]
        ans=0
        for i in nums:
            ans+=abs(i-median)
        return ans

        