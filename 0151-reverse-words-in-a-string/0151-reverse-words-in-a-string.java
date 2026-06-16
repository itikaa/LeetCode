class Solution {
    public String reverseWords(String s) {
        StringBuilder res=new StringBuilder();
        String ans="";
        int i=s.length()-1;
       while(i>=0){
                while(i>=0 && s.charAt(i)==' '){
                    i--;
                }
                while(i>=0 && s.charAt(i)!=' '){
                    res.append(s.charAt(i));
                    i--;
                }
                ans+= res.reverse();
               if(i>0){ ans+=" ";}
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