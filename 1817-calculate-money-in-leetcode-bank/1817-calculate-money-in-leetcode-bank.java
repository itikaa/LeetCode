class Solution {
    public int totalMoney(int n) {
         int N=1; int ans=1; int j=1;
         for(int i=2;i<=n;i++){
            if(i%7==1){ N++; j=N; ans+=N; }
            else{ 
            j++;
            ans+=j;
            }
         }
         return ans;
    }
}