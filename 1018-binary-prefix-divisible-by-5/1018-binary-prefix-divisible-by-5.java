class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> ans=new ArrayList<>();
        int c=0;
        for(int i=0;i<nums.length;i++){
               c=((c*2)+nums[i])%5;
              if(c==0){
                ans.add(true);
              }
              else{ans.add(false);}
            
        }
        return ans;
    }
}