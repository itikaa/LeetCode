class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return find(nums, k)-find(nums, k-1);
    }

    public int find(int[] nums,int k){
        if(k<0){return 0;}
     int odd=0;
     int left=0;
     int right=0;
     int count=0;
     while(right<nums.length){
        if(nums[right]%2!=0){odd++;}

      while(odd>k){
        if(nums[left]%2!=0){
            odd--;
        }
        left++;
      }
      if(odd<=k){
        count+=(right-left+1);
      }
      right++;
     }
     return count;

    }
}