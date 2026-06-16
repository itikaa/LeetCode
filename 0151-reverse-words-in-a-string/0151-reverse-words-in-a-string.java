class Solution {
    public String reverseWords(String s) {
        StringBuilder res=new StringBuilder();
        String ans="";
        for(int i=s.length()-1;i>=0;i--){
                while(i>=0 && s.charAt(i)==' '){
                    i--;
                }
                while(i>=0 && s.charAt(i)!=' '){
                    res.append(s.charAt(i));
                    i--;
                }
                // if(i<0){break;}
                ans+= res.reverse();
                ans+=" ";
                res=new StringBuilder();
        }
        ans=ans.trim();
        if(!res.isEmpty()){
            ans+=" ";
            ans+=res.reverse();
        }
        return ans;
    }
}