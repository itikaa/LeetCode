class Solution {
    HashMap <Integer,ArrayList<Integer>> adj;
    int component=0;
    public int countCompleteComponents(int n, int[][] edges) {
       adj = new HashMap<>();

for (int i = 0; i < n; i++) {
    adj.put(i, new ArrayList<>());
}
        for(int i=0;i<edges.length;i++){
           int u=edges[i][0];
           int v=edges[i][1];
           adj.get(u).add(v);
           adj.get(v).add(u);
        }
         return bfs(n);
    }

    int bfs(int n){
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited=new boolean[n];

         for(int i=0;i<n;i++){
            if(visited[i]==false){
                q.add(i);
                visited[i]=true;
            
            int nodes = 0;
            int degreeSum = 0;

            while( !q.isEmpty()){
                int curr=q.poll();
                 nodes++;
                degreeSum += adj.get(curr).size();

                ArrayList<Integer> connected = adj.get(curr);

    for (int j = 0; j < connected.size(); j++) {
    int neighbor = connected.get(j);

    if (!visited[neighbor]) {
        visited[neighbor] = true;
        q.offer(neighbor);
         }
        }
            }
            int actualEdges = degreeSum / 2;
            int expectedEdges = nodes * (nodes - 1) / 2;

            if (actualEdges == expectedEdges) {
                component++;
            }
            }
         }
   return component;

    }
}