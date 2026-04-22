class Solution {
    public int search(int[] nums, int target) {
       return bs(0, nums.length-1, nums, target);
       
    }
            public int bs(int low, int high ,int[] nums, int target){
         while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                return mid;
            }
            // left part is sorted
            if(nums[mid]>=nums[low]){
                    //check target in the left part 
                    if(nums[low]<=target && target<=nums[mid]){
                        return bs(low,mid-1,nums,target);
                    }
                    //check right part
                    else{
                        return bs(mid+1, high , nums,target);
                    }
            }
            //right part is sorted
            else {
                   //check target in the right part 
                     if(nums[mid]<=target && target<=nums[high]){
                       return bs(mid+1, high , nums, target);
                     }
                     //check left part
                     else{
                       return bs(low, mid-1, nums, target);
                     }
            }
        }
        return -1;
        }
    
}