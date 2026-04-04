class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int left=0;
         int right=0;
         int count=0;
         int zero=0;
         while(right<n){

      while(zero>k){
        if(nums[left]==0){
            zero--;
           }
         left++;
      }

      if(nums[right]==0){
        zero++;
      }
      if(zero<=k){
      count=Math.max(count,right-left+1);
      }
      right++;
         }
         return count;
    }
}