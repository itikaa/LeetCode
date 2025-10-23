class Solution {
    public boolean hasSameDigits(String s) {
        int n=s.length();
        if(n<2) return false;
        if(n==2){return s.charAt(0)==s.charAt(1); }
        StringBuilder sb=new StringBuilder();
              for(int i=0;i<n-1;i++){
                char sum=(char)((((s.charAt(i)-'0')+(s.charAt(i+1)-'0'))%10)+'0');
                sb.append(sum);
              }
        return hasSameDigits(sb.toString());
        
    }
}