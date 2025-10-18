class Solution {
     public Integer[][] dp;
    public int getMoneyAmount(int n) {
         dp = new Integer[n+1][n+1];
        int ans=solve(1,n);
         return ans;
    }
    public int solve(int s,int e){
        int value=Integer.MAX_VALUE;
        if(s>=e){return 0;}
        if(dp[s][e]!=null){return dp[s][e];}
        for(int i=s;i<=e;i++ ){
            value=Math.min(value,i+Math.max(solve(s,i-1),solve(i+1,e)));
        }
        dp[s][e]=value;
        return value;
    }
}