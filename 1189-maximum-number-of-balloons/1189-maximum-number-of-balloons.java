class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] freq=new int[26];
        for(int i=0;i<text.length();i++){
            char c=text.charAt(i);
                freq[c-'a']++;
        }
        int min=Integer.MAX_VALUE;
        min=Math.min(freq[0],freq[1]);
        min=Math.min(min,freq['l'-'a']/2);
         min=Math.min(min,freq['o'-'a']/2);
          min=Math.min(min,freq['n'-'a']);
          return min;

    }
}