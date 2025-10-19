class Solution {
    public String findLexSmallestString(String s, int a, int b) {
        int n=s.length();
        Queue<String> q=new LinkedList<>();
        HashSet<String> st=new HashSet<>();
        String small=s;
      q.add(s);
      st.add(s);
        while(!q.isEmpty()){
        String curr=q.poll();
        if(curr.compareTo(small)<0){
            small=curr;
        }
        String first=curr.substring(n-b,n)+curr.substring(0,n-b);
        StringBuilder str=new StringBuilder();
        for(int i=0;i<n;i++){
            if(i%2!=0){
                int val=curr.charAt(i)-'0';
               str.append((val+a)%10);
            }
            else
            str.append(curr.charAt(i)-'0');
        }
        String second=str.toString();

       if(!st.contains(first))q.add(first); st.add(first);
      if(!st.contains(second)) q.add(second); st.add(second);
        }
        return small;
    }

}