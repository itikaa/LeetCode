class Solution {

    int[][] dp = new int[301][11];
    public int minDifficulty(int[] jobDifficulty, int d) {
        int sum=0; 
        for(int j:jobDifficulty){
            sum+=j;
        }
        int n=jobDifficulty.length;
        if(n<d) return -1;
        if(n==d)return sum;

        //intialize dp (memoization)
          for (int i = 0; i < 301; i++) {
            Arrays.fill(dp[i], -1);
        }
        return solve(jobDifficulty , n, 0, d);
    }

    public int solve(int[] job, int n , int idx, int d){
         // base 
        if(d==1){
             int max=job[idx];
             for(int j=idx+1; j<n;j++){
                max=Math.max(max,job[j]);
             }
             return max;
        }
        int max=0;
        int result=0;
        int finalans=Integer.MAX_VALUE;
        if(dp[idx][d]!=-1){
            return dp[idx][d];
        }
        for(int i=idx; i<=n-d; i++){
                max=Math.max(max,job[i]);
                result=max+ solve(job , n, i+1, d-1);
                finalans= Math.min(finalans,result);    
        }
        dp[idx][d]=finalans;
        return finalans; 
    }
}