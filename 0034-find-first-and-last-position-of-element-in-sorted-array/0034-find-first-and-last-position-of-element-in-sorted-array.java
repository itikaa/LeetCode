class Solution {

    public int[] searchRange(int[] nums, int target) {
        int start=leftbs(nums, target);
        int end=rightbs(nums,target);
         return new int[]{start,end};
    }

    public int  leftbs(int[] nums,int target){
        int low=0; int high=nums.length-1; int index=-1;
        while(low<=high){
              int mid=low+(high-low)/2;
            if(nums[mid]==target){
                index=mid;
                high=mid-1;
            }
            else if(nums[mid]>target){
                  high=mid-1;
            }
            else{
                 low=mid+1;
            }
        }
         return index;
    }

     public int  rightbs(int[] nums,int target){
        int low=0; int high=nums.length-1; int index=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                index=mid;
                low=mid+1;
            }
            else if(nums[mid]>target){
                  high=mid-1;
            }
            else{
                 low=mid+1;
            }
        }
         return index;
    }
}