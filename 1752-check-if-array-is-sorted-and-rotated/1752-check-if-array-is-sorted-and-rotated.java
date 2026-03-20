class Solution {
    public boolean check(int[] nums) {
        int a=nums[0];
        int check=nums[0];
        int i=1;
        while(i<nums.length){
            if(nums[i]>=check){check=nums[i];i++; }
            else{check=nums[i]; break;}
        }
while(i<nums.length){
    if(nums[i]>=check && nums[i]<=a){check=nums[i]; i++;}
    else{return false;}
}
        return true;
    }
}