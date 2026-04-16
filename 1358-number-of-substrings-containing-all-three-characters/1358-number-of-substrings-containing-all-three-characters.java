class Solution {
    public int numberOfSubstrings(String s) {
        int r=0; 
        int l=0; 
        int n=s.length();
        int count=0;
        HashMap<Character,Integer> mp= new HashMap<>();
        while(r<n){
             mp.put(s.charAt(r), mp.getOrDefault(s.charAt(r),0)+1);
             while(mp.size()==3){
                count++;
                count+=(n-1-r);
                mp.put(s.charAt(l),mp.get(s.charAt(l))-1);
                if(mp.get(s.charAt(l))==0){
                    mp.remove(s.charAt(l));
                }
                l++;
             }
             r++;
        }
        return count;
    }
}