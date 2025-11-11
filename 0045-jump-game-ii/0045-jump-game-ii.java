class Solution {
    public int jump(int[] nums) {
        return count(nums,0,0);

}    
public int count(int[] nums, int start,int end){
    if(end>=nums.length-1){return 0;}
       int newend=end;
    for(int i=start;i<=end;i++){
         newend=Math.max(newend,nums[i]+i);
    }
    return 1+count(nums,end+1,newend);
}
}