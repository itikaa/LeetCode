class Solution {
    public String minWindow(String s, String t) {
        int n1=s.length();
        int n2=t.length();
        String ans="";
        HashMap<Character,Integer> mp=new HashMap<>();
        if(n2>n1){
            return ans;
        }
        for(int i=0;i<n2;i++){
            mp.put(t.charAt(i),mp.getOrDefault(t.charAt(i),0)+1);
        }
        int l=0; int r=0; 
        int count=0;
        int min=Integer.MAX_VALUE;
        int start=-1;
        while(r<n1){
            char ch = s.charAt(r);
             if (mp.containsKey(ch)) {
                if (mp.get(ch) > 0) {
                    count++;
                }
                mp.put(ch, mp.get(ch) - 1);
            }
            while(count==n2){
           if(min>(r-l+1)){
            start=l; min=r-l+1;
           }
           if(mp.containsKey(s.charAt(l))){
           if(mp.get(s.charAt(l))<0){
            mp.put(s.charAt(l),mp.get(s.charAt(l))+1);
           }
           else{ mp.put(s.charAt(l),mp.get(s.charAt(l))+1);
           count--;}
           }

           l++;
            }

            r++;
        }
        return start==-1?"":s.substring(start,start+min);
    }
}