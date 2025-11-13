class Solution {
    public int maxOperations(String s) {
        int one=0; int ans=0;
        int n=s.length(); int zero=0;
        for(int i=0;i<n;i++){
           if(s.charAt(i)=='1'){
            if(zero!=0){ans+=one; zero=0;}
            one++;
           }
           else if(one!=0){zero++;}
        }
        if(zero!=0){ans+=one; zero=0;}
        return ans;
    }
}