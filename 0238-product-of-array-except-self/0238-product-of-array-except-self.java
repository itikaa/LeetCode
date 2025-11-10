class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zero=0; int product=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){ zero++;}
             else{product*=nums[i];}
        }

for(int i=0;i<nums.length;i++){
    if(zero>1){nums[i]=0;}
     else if(nums[i]==0 && zero==1){ nums[i]=product;}
     else if(nums[i]!=0 && zero>0){nums[i]=0;}
     else {nums[i]=product/nums[i];}
}
return nums;
    }
}