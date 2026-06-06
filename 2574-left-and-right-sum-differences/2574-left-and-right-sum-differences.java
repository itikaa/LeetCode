class Solution {
    public int[] leftRightDifference(int[] nums) {
        int sum=0;
        int n=nums.length;
        int [] ans=new int[n];
        for(int i:nums){
            sum+=i;
        }
        int rightsum=0; 
        int leftsum=sum;
        for(int i=0;i<n;i++){
            leftsum-=nums[i];
            ans[i]=Math.abs(leftsum-rightsum);
            rightsum+=nums[i];

        }
        return ans;
    }
}