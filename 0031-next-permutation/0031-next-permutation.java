class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int index=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
               index=i;
               break;
            }
         }
       
//swap index and s
      if(index!=-1){
          int s=0;
        for(int i=n-1;i>index;i--){
            if(nums[i]>nums[index]){
                 s=i;
                 break;
            }
        }
        
        int temp=nums[index];
        nums[index]=nums[s];
        nums[s]=temp;

        int l=index+1;
        int e=n-1;
        while(l<e){
        int t=nums[l];
        nums[l]=nums[e];
        nums[e]=t;
        l++; e--;
        }
}
else{

 int l=0;
 int e=n-1;
  while(l<e){
        int temp=nums[l];
        nums[l]=nums[e];
        nums[e]=temp;
        l++; e--;
  }
    }
}
}