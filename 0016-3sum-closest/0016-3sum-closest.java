class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n=nums.length;
           int result=0;
           int ans=Integer.MAX_VALUE;
        for(int i=0;i<nums.length-2;i++){
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(Math.abs(target-sum)< ans){
                    result=sum;
                    ans=Math.abs(target-sum);
                }
                if(sum>target){
                    k--;
                }
                else{
                    j++;
                }
            }
        }
return result;
        
    }
}