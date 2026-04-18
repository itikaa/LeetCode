class Solution {
    public int mirrorDistance(int n) {
       int r= reverse(n);
       return Math.abs(n-r);
    
    }
    int reverse(int num){
        int r=0;
        while(num>0){
            int d=num%10;
            r=r*10+d;
            num/=10;
        }
        return r;
    }
}