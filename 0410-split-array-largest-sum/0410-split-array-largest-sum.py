class Solution(object):
    def splitArray(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        low=max(nums)
        high=sum(nums)
        while(low<=high):
            mid=(low+high)//2
            split= self.func(mid,nums,k)
            if (split>k):
                low=mid+1
            else:
                high=mid-1
        return low
    def func(self,mid,nums,k):
        count_split=1
        sum=0
        for i in range(0,len(nums)):
            if (sum + nums[i])<=mid:
                sum+=nums[i]
            else:
                count_split+=1
                sum=nums[i]
        return count_split
            


        