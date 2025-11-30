class Solution {
    public int maxDistinct(String s) {
        int[] check=new int[26];
        int count=0;
        for(int i=0;i<s.length();i++){
            if(check[s.charAt(i)-'a']==0){
                check[s.charAt(i)-'a']++;
                count++;
            }
        }
        return count;
    }
}