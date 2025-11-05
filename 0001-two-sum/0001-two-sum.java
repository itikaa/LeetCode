class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        int[] array=new int[2];
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(target-nums[i]) && mp.get(target-nums[i])!=i){
                array[0]=i;
                array[1]=mp.get(target-nums[i]);
            }
        }
        return array;
    }
}