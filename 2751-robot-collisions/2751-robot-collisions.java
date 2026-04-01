class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        List<Integer> ans=new ArrayList<>();
        int n=positions.length;
        Stack<Integer> st=new Stack<>();
        Integer[] idx = new Integer[n];
        for (int i = 0; i < n; i++) idx[i] = i;

        Arrays.sort(idx,(a,b)->positions[a]-positions[b]);

        for(int i:idx){
             if(directions.charAt(i)=='R'){
                st.push(i);
             }
             else{

                while( !st.isEmpty() && directions.charAt(st.peek())=='R' && healths[i]!=0){
                    int check=st.peek();
                if(healths[check] < healths[i]){
                    healths[check]=0;
                    st.pop();
                    healths[i]--;
                }
                else if(healths[check] > healths[i]){
                    healths[check]--;
                    healths[i]=0;
                }
                else{
                    healths[st.peek()]=0;
                    st.pop();
                    healths[i]=0;
                }
                }
                if(healths[i]>0){
                    st.push(i);
                }

             }

     }
     for(int i=0;i<n;i++){
        if(healths[i]!=0){
            ans.add(healths[i]);
        }
     }
     return ans;
    }

}