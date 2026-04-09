class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return find (nums, k)-find(nums, k-1);
    }

    public int find(int[] nums, int k){
        int count=0;
        if(k==0){
            return 0;
        }
        int left=0; int right=0;
        HashMap<Integer, Integer> mp=new HashMap<>();
        while(right<nums.length){
           mp.put(nums[right],mp.getOrDefault(nums[right],0)+1);
            while(mp.size()>k){
                mp.put(nums[left],mp.get(nums[left])-1);
                if(mp.get(nums[left])==0){
                    mp.remove(nums[left]);
                }
                left++;
            }
               count+=(right-left+1);
               right++;
        }
        return count;
    }
}