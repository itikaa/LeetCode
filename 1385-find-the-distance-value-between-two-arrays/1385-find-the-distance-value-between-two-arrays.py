class Solution(object):
    def findTheDistanceValue(self, arr1, arr2, d):
        """
        :type arr1: List[int]
        :type arr2: List[int]
        :type d: int
        :rtype: int
        """
        count=0
        arr2.sort()
        for i in arr1:
            low=0
            high=len(arr2)-1
            while(low<=high):
                mid=(low+high)//2
                if(abs(i-arr2[mid])<=d):
                    break
                elif i<arr2[mid]:
                    high=mid-1
                else:
                    low=mid+1
            else:
                count+=1
        return count
            
            
        