class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int low=0; int high=nums.length-1;
        int n=nums.length;
        int[] ans=new int[n];
        int i=0; int j=0;
        while(i<n){
            if(nums[i]<pivot){
                ans[low]=nums[i];
                low++;
            }
            else if(nums[i]>pivot){
                ans[high]=nums[i];
                high--;
            }
            i++;
        }
        for(int k=low;k<=high;k++){
         ans[k]=pivot;
        }
        reverse(ans, high+1 ,nums.length-1);
        return ans;
    }
    public void reverse(int[] ans, int i , int j){
           while(i<=j){
            int  temp=ans[i]; 
        ans[i]=ans[j];
            ans[j]=temp;
            i++ ; j--;
           }
    
    }
}