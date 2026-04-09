class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        int n=queries.length;
        int MOD = 1000000007;
        int xor=0;
        for(int i=0;i<n;i++){
            int l=queries[i][0];
            int r=queries[i][1];
            int k=queries[i][2];
            int v=queries[i][3];
            while(l<=r){
                nums[l]=(int)((1L * nums[l] * v) % MOD);
                l+=k;
            }
        }

        for(int i:nums){
            xor^=i;
        }
        return xor;
    }
}