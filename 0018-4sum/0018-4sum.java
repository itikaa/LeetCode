class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        Set<List<Integer>> st=new HashSet<>();
   List<List<Integer>> ans=new ArrayList<>();
   int n=nums.length;
   for (int i=0;i<n-3;i++){
       for(int j=i+1;j<n-2;j++){
          int k=j+1;
          int l=n-1;
          while(k<l){
          long sum=(long)nums[i]+nums[j]+nums[k]+nums[l];
          if(sum==target ){
            st.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]) );
            k++;
          }
          else if (sum<target){
            k++;
          }
          else if (sum>target){
            l--;
          }
          }
       }
   }
    ans.addAll(st);
    return ans;
    }
}