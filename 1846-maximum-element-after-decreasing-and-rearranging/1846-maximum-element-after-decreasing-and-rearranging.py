class Solution(object):
    def maximumElementAfterDecrementingAndRearranging(self, arr):
        arr.sort()
        arr[0]=1
        max_val=1
        for i in range(1,len(arr)):
           if arr[i]-arr[i-1]>1:
            arr[i]=arr[i-1]+1
           max_val=max(max_val,arr[i])
        return max_val
        