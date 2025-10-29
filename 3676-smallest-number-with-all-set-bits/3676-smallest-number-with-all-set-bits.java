class Solution {
    public int smallestNumber(int n) {
        int p=0;
       int check=1;
       if(n==1){return 1;}
       for(int i=1;i<n;i++){
        if(check>n) {break; }
        check=2*check;
        p++;
       }

        return (1<<p)-1;
    }
}