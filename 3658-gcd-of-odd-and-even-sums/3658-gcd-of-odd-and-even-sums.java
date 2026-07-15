class Solution {
    public int gcdOfOddEvenSums(int n) {
        int even=0;
        int odd=0;
        for(int i=1;i<=n*2;i++){
            if(i%2==0){
                even+=i;
            }
            else{
                odd+=i;
            }
        }
        return gcd(even,odd);
    }

    int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    } 
}