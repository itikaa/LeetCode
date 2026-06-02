class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int n=cost.length;
        int i=n-1;
        int sum=0;
     sum+=cost[i];
        i-=3;
        int j=n-2;
        if(n>1){
            sum+=cost[j];
            j-=3;
        }
        while(j>=0){
             sum+=cost[i];
             sum+=cost[j];
             j-=3; i-=3;
        }
        if(i==0){
            sum+=cost[i];
        }
        return sum;

         
    }
}