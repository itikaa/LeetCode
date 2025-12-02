class Solution {
    static final long MOD = 1000000007;

    public int countTrapezoids(int[][] points) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        ArrayList<Long> a=new ArrayList<>();
    
        for(int i=0;i<points.length;i++){
            int x=points[i][0];
            int y=points[i][1];
            mp.put(y,mp.getOrDefault(y,0)+1);
      
        }
        for(Map.Entry<Integer,Integer > e:mp.entrySet()){
                 long n=e.getValue();
               long count=(n*(n-1)/2) % MOD;
              a.add(count);
        }
    long sum=0;
    long ans=0;
        for(int i=0;i<a.size();i++){
            ans=(ans+(sum*a.get(i))% MOD)% MOD;
            sum=(sum+a.get(i))%MOD;
     
            
        }
        return (int)ans;
    }
}