class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> mp=new HashMap<>();
        int l=0;
        int r=0; 
        int max=Integer.MIN_VALUE;
    int ans=0;
        while(r<s.length()){
           mp.put(s.charAt(r),mp.getOrDefault(s.charAt(r),0)+1);
           int check=mp.get(s.charAt(r));
            max= Math.max(max,check);

           while((r-l+1)-max>k){
              mp.put(s.charAt(l),mp.get(s.charAt(l))-1);
              if(mp.get(s.charAt(l))==0){
                mp.remove(s.charAt(l));
              }
              l++;
           }
           ans=Math.max(ans,r-l+1);
     r++;
        }
        return ans;
    }
}