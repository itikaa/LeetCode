class Solution {
    public int maxScore(int[] cardPoints, int k) {
          int sum=0; int max=Integer.MIN_VALUE;
          int n=cardPoints.length;
       for(int i=0;i<k;i++){
          sum+=cardPoints[i];
       }
       max=Math.max(sum,max);
       for(int i=0;i<k;i++){
        sum-=cardPoints[k-1-i];
        sum+=cardPoints[n-i-1];
        max=Math.max(sum,max);
       }
       return max;
    }
    
}