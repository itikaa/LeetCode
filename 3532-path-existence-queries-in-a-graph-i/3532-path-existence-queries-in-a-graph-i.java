class Solution {
    public boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {
        
       boolean[] ans=new boolean[queries.length];
       int[] parent=new int[n];

        parent[0]=0;
       for(int i=1;i<n;i++){
        if(Math.abs(nums[i]-nums[i-1])<=maxDiff){
            parent[i]=parent[i-1];
        }
        else{
            parent[i]=i;
        }
       }

       for(int i=0;i<queries.length;i++){
           int u=queries[i][0];
           int v=queries[i][1];
           if(parent[u]==parent[v]){
            ans[i]=true;
           }
           else{
            ans[i]=false;
           }
       }
       return ans;
    }
}