class Solution {
    public int lengthOfLongestSubstring(String s) {
          int n=s.length();
          int left=0;
          int right=0;
          int count=0;
          HashSet<Character> st=new HashSet<>();
          while(right<n){
             char c=s.charAt(right);
              while(st.contains(c)){
                st.remove(s.charAt(left));
                left++;
             }
             if(!st.contains(c)){
                st.add(c);
                count=Math.max(count,st.size());
                right++;
             }
        
          }
          return count;
    }
}