class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st=new Stack<>();
        String ans="";
        for(int i=0;i<s.length();i++){
       if(st.size()>=2 && s.charAt(i)==')'){
           ans+=s.charAt(i);
           st.pop();
        }
        else if(s.charAt(i)=='('){
            if(st.isEmpty()){
                st.push(s.charAt(i));
            }
            else{
       st.push(s.charAt(i));
       ans+=s.charAt(i);
            }
        }
        else{
            st.pop();
        }
        }
        return ans;
    }
}