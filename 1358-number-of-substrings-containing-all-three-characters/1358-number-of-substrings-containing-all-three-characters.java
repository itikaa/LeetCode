class Solution {
    public int numberOfSubstrings(String s) {
        int left =0; 
        int count=0;
        int n=s.length();
        int[] char_count=new int[3];

        for(int i=0;i<n;i++){
           char_count[s.charAt(i)-'a']++;
           while(char_count[0]>0 && char_count[1]>0 && char_count[2]>0){
            count+=(n-i);
            char_count[s.charAt(left)-'a']--;
            left++;
           }
        }
        return count;

    }
}