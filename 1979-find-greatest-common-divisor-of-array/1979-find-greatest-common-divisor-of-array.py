class Solution(object):
    def findGCD(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        min=float('inf')
        max=0
        for i in range(0,len(nums)):
            if nums[i]>max:
                max=nums[i]
            if min>nums[i]:
                min=nums[i]
        return self.gcd(min,max)

    def gcd(self,a,b):
        if b==0:
            return a
        return self.gcd(b,a%b)

        