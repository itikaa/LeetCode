class Solution {
    public long countMajoritySubarrays(int[] nums, int target) {
        int n=nums.length;
        int len=2*n+2;
        long[] freq=new long[len];
        long[] cumm=new long[len]; 
        freq[n+1]=1;
        cumm[n+1]=1;
    int sum=0;
    long total=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=target){
                sum--;
            }
            else{sum++;}
            freq[sum+n+1]++;
            cumm[sum +n+1]=cumm[sum+n]+freq[sum+n+1];
            total+=cumm[sum+n];
        }
        return total;
    }
}