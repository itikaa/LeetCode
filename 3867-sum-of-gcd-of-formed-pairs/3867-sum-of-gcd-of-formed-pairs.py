class Solution(object):
    def gcdSum(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        prefixGcd=[0]*len(nums)
        mx=0
        j=0
        for i in range(0,len(nums)):
            if(nums[i]>mx):
                mx=nums[i]
            prefixGcd[j]=self.gcd(mx,nums[i])
            j+=1
        
        prefixGcd.sort()
        l=0
        r=len(nums)-1
        sum=0
        while(l<r):
            sum+=self.gcd(prefixGcd[l],prefixGcd[r])
            l+=1
            r-=1
        return sum

        
    def gcd(self,a,b):
        if b==0:
            return a
        return self.gcd(b,a%b)
