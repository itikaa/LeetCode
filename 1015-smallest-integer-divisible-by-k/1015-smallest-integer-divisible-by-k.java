class Solution {
    public int smallestRepunitDivByK(int k) {
         if(k%2==0 || k%5==0){return -1;}
         int num=1;
         int count=1;
         for(int i=0;i<k;i++){
            if(num%k==0){
                return count;
            }
            num=((num*10)+1)%k;
            count++;
         }
         return -1;
    }
}