class Solution {
    public boolean search(int[] nums, int target) {
        return bs(0,nums.length-1, nums, target);
    }
    public boolean bs(int low, int high , int[] nums , int target){

        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                return true;
            }
            if(nums[low]==nums[mid] && nums[mid]==nums[high]){
                low++; high--;
                continue;
            }
            //left part is sorted
            if(nums[low]<=nums[mid]){
                    if(nums[low]<=target && target<nums[mid]){
                       high=mid-1;
                    }
                    else{
                       low=mid+1;
                    }
            }
            //right part is sorted
            else{
                   if(nums[mid]<target && target<=nums[high]){
                   low=mid+1;
                   }
                   else{
                   high=mid-1;
                   }
            }

        }
        return false;
    }
}