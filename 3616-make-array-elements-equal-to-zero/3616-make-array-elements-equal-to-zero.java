class Solution {
    public int countValidSelections(int[] nums) {
        int n=nums.length; int count=0;
    int[] prefixSum=new int[n];
    prefixSum[0]=nums[0];
    for(int i=1;i<n;i++){
        prefixSum[i]=prefixSum[i-1]+nums[i];
    }
    for(int i=0;i<n;i++){
        if(nums[i]==0){
            int left=prefixSum[i];
            int right=prefixSum[n-1]-prefixSum[i];
            if(left==right){count+=2;}
            else if(Math.abs(left-right)==1){count++;}
        }
    }
    return count;
    }
}