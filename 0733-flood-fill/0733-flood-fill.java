class Solution {
    public int[][] directions={{-1,0},{1,0},{0,1},{0,-1}};
    int rows; int cols;
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        rows=image.length;
        cols=image[0].length;
        int change=image[sr][sc];
        dfs(image,sr,sc,color,change);
        return image;
    }
    public void dfs(int[][] image ,int row,int col,int color,int change){
         if(row<0 || row>=rows || col<0 || col>=cols || image[row][col]==color || image[row][col]!=change)
            {return; }
          image[row][col]=color;
          for(int[] d:directions){
              dfs(image,row+d[0],col+d[1],color,change);
          }
          
    }
}