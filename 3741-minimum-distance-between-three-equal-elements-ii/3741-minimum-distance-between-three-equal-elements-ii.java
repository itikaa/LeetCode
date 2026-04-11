class Solution {
    public int minimumDistance(int[] nums) {
        HashMap<Integer,List<Integer>> mp=new HashMap<>();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            mp.putIfAbsent(nums[i], new ArrayList<>());
            mp.get(nums[i]).add(i);
        }
        for(List<Integer> e:mp.values()){
            if(e.size()<3){continue;}
            for(int i=0; (i+2)<e.size();i++){
                int dis=2*(e.get(i+2)-e.get(i));
                min=Math.min(min,dis);
            }
        }
        if(min==Integer.MAX_VALUE){
            return -1;
        }
        return min;
    }
}