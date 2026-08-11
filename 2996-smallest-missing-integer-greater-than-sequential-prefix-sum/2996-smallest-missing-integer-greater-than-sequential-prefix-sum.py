class Solution(object):
    def missingInteger(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        s=set()
        for i in nums:
            s.add(i)
        
        sum=nums[0]
        
        for i in range(1,len(nums)):
            if nums[i]==nums[i-1]+1:
                sum+=nums[i]
            else:
                break
        while sum in s:
            sum+=1
        return sum
                


        
        