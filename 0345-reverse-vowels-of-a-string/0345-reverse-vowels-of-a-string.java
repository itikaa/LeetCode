class Solution {
    public String reverseVowels(String s) {
        int i=0;
        String vowels="AEIOUaeiou";
        int j=s.length()-1;
        char[] word = s.toCharArray();
        while(i<=j){
           while(i<j && !vowels.contains(String.valueOf(s.charAt(i)))){
               i++;
           }
           while(i<j && !vowels.contains(String.valueOf(s.charAt(j)))){
               j--;
            }
           char temp=word[i];
           word[i]=word[j];
           word[j]=temp;
        i++; j--;
            
        }
    return new String(word);
    }
}