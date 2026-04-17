class Solution {
    public int minMirrorPairDistance(int[] nums) {
        int min=Integer.MAX_VALUE;
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
           int r= reverse(nums[i]);

       if(mp.containsKey(nums[i])){
            min=Math.min(min,i-mp.get(nums[i]));
        }
        mp.put(r,i);
        }
        return min==Integer.MAX_VALUE?-1:min;
    }
    public int reverse(int num){
        int r=0;
        while(num>0){
               int d=num%10;
               r=r*10+d;
               num/=10;
        }
        return r;
    }

}