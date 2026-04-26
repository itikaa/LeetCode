class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int r=0;
     for(int p:piles){
        if(p>r){r=p;}
     }
     while(l<=r){
        int mid=l+(r-l)/2;
        int count=0;
        for(int p:piles){
            count+=(p/mid);
            if((p%mid)>0){
                count++;
            }
        }
        if(count>h){
            l=mid+1;
        }
        else if(count<=h){
            r=mid-1;
        }
     }
     return l;
    }
}