class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp=new int[amount+1];
        dp[0]=0;
         for(int i=1;i<amount+1;i++){
            dp[i]=Integer.MAX_VALUE;
            for(int c:coins){
                if(c<=i && dp[i-c]!=Integer.MAX_VALUE){
                dp[i]=Math.min(dp[i],1+dp[i-c]);
                }
            }
         }
         if(dp[amount]==Integer.MAX_VALUE){return -1;}
         return dp[amount];
    }
}