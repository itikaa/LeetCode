class Solution {
    public int findCircleNum(int[][] isConnected) {
        HashMap<Integer,ArrayList<Integer>> mp=new HashMap<>();
        int n=isConnected.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(isConnected[i][j]==1){
                    mp.putIfAbsent(i+1,new ArrayList<>());
                    mp.get(i+1).add(j+1);
                    mp.putIfAbsent(j+1,new ArrayList<>());
                    mp.get(j+1).add(i+1);
                }
            }
        }
    int count=0;

        Queue<Integer> q=new LinkedList<>();
        boolean[] visited=new boolean[n+1];
        q.offer(1);
        visited[1]=true;
          count++;
        for(int i=1;i<n+1;i++){
         
         if(visited[i]==false){
            q.offer(i);
            visited[i]=true;
            count++;
         }
          
        
        while(!q.isEmpty()){
            int current=q.poll();
             ArrayList<Integer> connected= mp.get(current);
             if(connected!=null){
             for(int next : connected) {
             if(!visited[next]) {
                 visited[next] = true;
                 q.offer(next);
                 }
             }
        }
        }
       
        
        }
return count;
    }
}