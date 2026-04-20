class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        int n=nums.length;
        for(int i:nums){
            sum+=i;
        }
        int left=0;
        for(int i=0;i<n;i++){
            if((i-1)>=0){
                left+=nums[i-1];
            }
            sum-=nums[i];
            if(left==sum){
                return i;
            }
        }
        return -1;
    }
}