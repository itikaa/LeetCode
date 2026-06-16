class Solution {
    public String processStr(String s) {
        StringBuilder res=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='*'){
                if( !res.isEmpty()) {res.deleteCharAt(res.length()-1); }
            }
            else if(c=='#'){
                String a=res.toString();
                res.append(a);
            }
            else if(c=='%'){
                res.reverse();
            }
            else{
                res.append(s.charAt(i));
            }
        }
        return res.toString();
    }
}