class Solution(object):
    def missingMultiple(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        nums.sort()
        i=1
        for j in range(len(nums)):
            if(k*i==nums[j]):
                i+=1
        return k*i
        