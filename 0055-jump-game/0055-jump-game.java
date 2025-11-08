class Solution {

    public boolean canJump(int[] nums) {
     int n=nums.length; int check=n-1;
     for(int i=n-2;i>=0;i--){
        if(nums[i]+i>=check){
            check=i;
        }
     }
     if(check==0){return true;}
     return false;
    }
}