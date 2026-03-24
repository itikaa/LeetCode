class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        List<Integer> ans= new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        int check=(n/3);
        for(Map.Entry<Integer,Integer> m:mp.entrySet()){
            if(m.getValue()>check){
               ans.add(m.getKey());
            }
        }
        return ans;
    }
}