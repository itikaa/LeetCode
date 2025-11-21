class Solution {
    public int countPalindromicSubsequence(String s) {
       // to store the first occurence of the charcter 
       int[] first=new int[26];
       //to store the second occurence of the charcter 
       int[] second=new int[26];
       int n=s.length();
       int count=0;
       Arrays.fill(first,Integer.MAX_VALUE);
       Arrays.fill(second,-1);

       for(int i=0;i<n;i++){
          int index=s.charAt(i)-'a';
            first[index]=Math.min(first[index],i);
            second[index]=Math.max(second[index],i);
       }
        
       
        for(int i=0;i<26;i++){
            HashSet<Character> st=new HashSet<>();
            if(first[i]==second[i] || first[i]==Integer.MAX_VALUE){
                continue;
                }
            for(int m=first[i]+1;m<second[i];m++){
                st.add(s.charAt(m));
            }
            count+=st.size();

        }
        return count;
    }
}