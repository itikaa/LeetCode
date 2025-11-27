class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        int n=nums.length;
       long[] prefix=new long[n];
       long ans=Long.MIN_VALUE;
       long currsum=0;
       prefix[0]=nums[0];
        for(int i=1;i<n;i++ ){
            prefix[i]=prefix[i-1]+nums[i];
        }
     
        for(int start=0;start<k;start++){
             long prev=0;
             int i=start;
             int j=i+k-1;
            while(i<n && j<n){
                currsum+=prefix[j];
                if(i>0){currsum-=prefix[i-1];}
                prev=Math.max(currsum,currsum+prev);
                ans=Math.max(prev,ans);
                i+=k; 
                j+=k;
                currsum=0;
                }
                
            }
        

        return ans;
    }
}