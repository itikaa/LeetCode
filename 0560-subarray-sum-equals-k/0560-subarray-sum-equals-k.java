class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        int n=nums.length;
        int sum=0;
        int count=0;
        for(int i=0;i<n;i++){
             sum+=nums[i];
             mp.put(sum,i);
             if(sum==k){count++;}
             else if(mp.containsKey(sum-k)){
                if(mp.get(sum-k)!=i){
                    count++;
                }
             }
        }
        return count;
        
    }
}