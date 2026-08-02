class Solution(object):
    def countRatioSubarrays(self, nums, a, b):
        """
        :type nums: List[int]
        :type a: int
        :type b: int
        :rtype: int
        """
        n=len(nums)
        count=0
        for i in range(0,n):
            even=0
            odd=0
            for j in range(i,n):
                if (nums[j]%2==0):
                    even+=1
                else:
                    odd+=1
                if(odd>0 and even*b<=odd*a):
                   count+=1
        return count

        

        