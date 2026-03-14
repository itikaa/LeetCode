class Solution {
    public void sortColors(int[] nums) {
      int low=0;
      int mid=0;
      int n=nums.length;
      int end=n-1;
      while(mid<=end){
        if(nums[mid]==1){
            mid++;
        }
        else if(nums[mid]==0){
          // swap(nums[low],nums[mid]);
           int temp=nums[low];
           nums[low]=nums[mid];
           nums[mid]=temp;
           low++;
           mid++;
        }
        else{
            //swap(nums[mid],nums[end]);
            int temp=nums[end];
           nums[end]=nums[mid];
           nums[mid]=temp;
            end--;
        }
      }
 
    }
}