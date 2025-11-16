class Solution {
    static final int M = 1_000_000_007;
    public int numSub(String s) {
        long count=0; long sum=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                count=0;
            }
              
              else{ 
              count++; 
              sum=(sum+count)%M;
               }
        }
        return (int)sum;
    }
}