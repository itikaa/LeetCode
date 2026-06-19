class Solution {
    public int largestAltitude(int[] gain) {
         int high=0;
         int ans=0;
         for(int g:gain){
               high+=g;
                 ans=Math.max(ans,high);
         }
         return ans;
    }
}