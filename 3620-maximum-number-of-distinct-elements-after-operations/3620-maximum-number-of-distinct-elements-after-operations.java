class Solution {
    public int maxDistinctElements(int[] nums, int k) {
Arrays.sort(nums);
int current =nums[0]-k;
int count=1;
        for(int i=1;i<nums.length;i++){
            int low=nums[i]-k;
            int high=nums[i]+k;
            if(current+1<=high){
            current =Math.max(low,current+1);
               count++;
            }
        }
return count;
    }
}