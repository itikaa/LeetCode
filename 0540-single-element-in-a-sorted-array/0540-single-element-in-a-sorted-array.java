class Solution {
    int n;
    public int singleNonDuplicate(int[] nums) {
        n=nums.length;
        return bs(0,nums.length-1, nums);
    }
    public int bs(int low, int high, int[] nums){
        while(low<=high){
            int mid=low+(high-low)/2;
            if( ((mid-1)<0 || nums[mid]!=nums[mid-1] ) &&  ((mid+1)>=n || nums[mid]!=nums[mid+1])){
                return nums[mid];
            }

          else if(mid +1<n && nums[mid]==nums[mid+1]){

          if((high-mid+1)%2==0){
                 high=mid-1;
          }
          else{
                  low=mid+2;
          } 
          }
           else if(mid-1>=0 && nums[mid]==nums[mid-1]){

            if((mid-1-low)%2==0){
                    low=mid+1;
            }
            else{
                high=mid-2;
            }
           }
            
        }
        return -1;
    }
}