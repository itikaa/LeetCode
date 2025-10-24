class Solution {
    public int nextBeautifulNumber(int n) {
        n++;
        while(true){
        if(check(n)){return n;}
        n++;
        }
    }
    boolean check(int n){
        int[] digit=new int[10];
        while(n!=0){
            digit[n%10]++;
            n/=10;
        }
        if(digit[0]!=0){return false;}
        for(int i=1;i<10;i++){
            if(digit[i]>0 && digit[i]!=i){return false;}
        }
        return true;
    }
}