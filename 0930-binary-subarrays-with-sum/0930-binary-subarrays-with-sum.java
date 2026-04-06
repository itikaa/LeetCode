class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
     return  find(nums, goal)- find(nums, goal-1);
    }

    public int find(int[] nums, int goal){
          int left=0; 
        int right=0;
        int n=nums.length;
        int sum=0;
        int count=0;
        if(goal<0){
            return 0;
        }
        while(right<n){
            sum+=nums[right];
            while(sum>goal){
                sum-=nums[left];
                left++;
            }
           count+=(right-left+1);
            right++;

        }
        return count;
    }
}