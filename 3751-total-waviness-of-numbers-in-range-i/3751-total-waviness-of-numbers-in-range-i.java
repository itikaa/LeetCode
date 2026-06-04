class Solution {
    public int totalWaviness(int num1, int num2) {
        int count=0;
        for(int i=num1;i<=num2;i++){
            count+=check(i);
        }
        return count;
    }
    int check(int n){
        int num=n;
        int digit=0;
        int ans=0;
        while(n!=0){
            n/=10;
            digit++;
        }
        if(digit<3){return ans;}
        int last=num%10;
        num/=10;
        int mid=num%10;
        num/=10;
        while(num!=0){
        int low=num%10;
        num/=10;
        if(low<mid && mid> last){
            ans++;
        }
       else  if(low> mid && mid<last){
          ans++; 
        }
        last=mid;
        mid=low;
        }
        return ans;
    }
}