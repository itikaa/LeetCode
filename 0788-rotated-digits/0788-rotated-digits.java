class Solution {
    public int rotatedDigits(int n) {
        int count=0;
        for(int i=2;i<=n;i++){
            if(check(i)){
                count++;
            }
        }
        return count;
    }
    public boolean check(int n){
        boolean flag=false;
        while(n>0){
            int digit=n%10;
            if(digit== 7 || digit ==3 || digit ==4){
                return false;
            }
            if(digit==2 || digit==5 || digit==6 || digit==9){
                flag=true;
            }
            n=n/10;
        }
        return flag;
    }
}