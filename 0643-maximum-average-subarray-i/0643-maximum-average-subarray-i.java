class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        int l=0;
        int r=k;
        int n=nums.length;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        double max=(sum/k);
        while(r<nums.length){
            sum+=nums[r];
            r++;
            sum-=nums[l];
            l++;
            max=Math.max(max,(sum/k));
        }
        return max;
    }
}