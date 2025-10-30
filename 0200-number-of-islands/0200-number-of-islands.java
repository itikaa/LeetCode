class Solution {
    int[][] directions={{1,0},{-1,0},{0,1},{0,-1}};
    int rows; int cols;

    public int numIslands(char[][] grid) {
     rows=grid.length;
     cols=grid[0].length;
     int count=0;
    boolean[][] visited=new boolean[rows][cols];
    for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            if(visited[i][j]!=true && grid[i][j]=='1'){
                dfs(grid,i,j,visited);
                count++;
            }
        }
    }
    return count;
    }

    public void dfs(char[][] grid,int r,int c, boolean[][] visited){
        if(r<0 ||r>=rows ||c<0 ||c>=cols || grid[r][c]=='0' || visited[r][c]==true){return;}
                visited[r][c]=true;
        for(int[] d: directions){
            dfs(grid,r+d[0],c+d[1],visited);
        }
    }
}