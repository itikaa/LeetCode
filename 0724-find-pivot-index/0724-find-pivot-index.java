class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length; int first=0; int second=0;
       int[] prefix =new int[n];
       prefix[0]=nums[0];

       for(int i=1;i<n;i++){
         prefix[i]=prefix[i-1]+nums[i];
       }

       for(int i=0;i<n;i++){
        if(i==0){ 
            first=0;
            second=prefix[n-1]-prefix[i];
            }
        else if(i==n-1){ 
            first=prefix[n-2];
            second=0;
            }
        else{
             first=prefix[i-1];
             second=prefix[n-1]-prefix[i];
        }
             if(first==second){
                return i;
             }
       }
    return -1;
    }
}