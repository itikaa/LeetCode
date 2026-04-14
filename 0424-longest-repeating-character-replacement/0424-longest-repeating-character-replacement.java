class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> mp=new HashMap<>();
        int left=0; int right=0;
  int ans=0; int max=Integer.MIN_VALUE;

        while(right<s.length()){

    int check=mp.getOrDefault(s.charAt(right),0)+1;
    mp.put(s.charAt(right),mp.getOrDefault(s.charAt(right),0)+1);
     max=Math.max(max,check);

    while((right-left+1)-max>k){
        mp.put(s.charAt(left),mp.get(s.charAt(left))-1);
        if(mp.get(s.charAt(left))==0){
            mp.remove(s.charAt(left));
        }
        left++;
    }
     ans=Math.max(ans,right-left+1);
     right++;
        }
return ans;
    }
}