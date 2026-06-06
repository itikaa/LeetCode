class Solution {
    public int thirdMax(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int third=Integer.MAX_VALUE;
        int second=Integer.MAX_VALUE;
        int first=nums[n-1];
        for(int i=n-2;i>=0;i--){
             if(second!=Integer.MAX_VALUE){
            if(nums[i]<second){
                third=nums[i];
                break;
            }
             }
            if(nums[i]<first){
               second=nums[i];
            }
           
            
        }
    return third==Integer.MAX_VALUE?first:third;
    }
}