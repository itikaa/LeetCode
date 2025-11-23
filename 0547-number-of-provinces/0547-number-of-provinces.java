class Solution {
    static boolean[] visited;
    public int findCircleNum(int[][] isConnected) {
        int count=0;
        int n=isConnected.length;
        visited=new boolean[n];
        for(int i=0;i<n;i++){
            if(visited[i]==false){
                dfs(visited,isConnected,i);
                count++;
            }
        }
        return count;
    
}

public void dfs(boolean[] visited,int[][] isConnected, int i){
          visited[i]=true;
          for(int j=0;j<isConnected[0].length;j++){
            if(isConnected[i][j]==1 && visited[j]==false){
                dfs(visited,isConnected,j);
            }
          }
}

}





