class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if(bloomDay.length< (m*k)){
            return -1;
        }
        int result=-1;
        int low=Integer.MAX_VALUE;
        int high=Integer.MIN_VALUE;
        for(int i:bloomDay){
            if(i<low){
                low=i;
            }
            if(i>high){
                high=i;
            }
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            if(check(mid,bloomDay,m , k)){
                result=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return result;

    }

    public boolean check(int n, int[] bloomDay, int m , int k){
               int count=0;
               int ans=0;
               for(int i:bloomDay){
                if(i<=n){
                    count++;
                }
                else{
                    ans+=(count/k);
                    count=0;
                }
               }
               ans+=(count/k);
               if(ans>=m){
                return true;
               }
               return false;
    }
}