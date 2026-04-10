class Solution {
    public int minimumDistance(int[] nums) {
        HashMap<Integer,List<Integer>> mp=new HashMap<>();
        int min=Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){
           mp.putIfAbsent(nums[i], new ArrayList<>());
           mp.get(nums[i]).add(i);
        }
 for (List<Integer> indices : mp.values()) {
            if (indices.size() < 3) continue;

            // Try consecutive triplets
            for (int i = 0; i + 2 < indices.size(); i++) {
                int dist = 2 * (indices.get(i + 2) - indices.get(i));
                min= Math.min(min, dist);
            }
        }
        if (min==Integer.MAX_VALUE){
            return -1;
        }
        return min;
    }
}