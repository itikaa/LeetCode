class Solution {
    public int minElement(int[] nums) {
        int min=Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            int ans=0;
            while(n!=0){
                int r= n%10;
                ans+=r;
                n/=10;
            }
            min=Math.min(min,ans);

        }
        return min;
    }
}