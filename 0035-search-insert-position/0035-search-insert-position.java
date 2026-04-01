class Solution {
    public int searchInsert(int[] nums, int target) {
        return bs(nums,0,nums.length-1,target);
    }
    public int bs(int[] nums,int low,int high, int target){
        if(low>high){return low;}
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){return mid;}
            else if(nums[mid]<target){
                return bs(nums,mid+1,high,target);
            }
            else{
                return bs(nums,0,mid-1,target);
            }
        }
        return -1;
    }
}