class Solution {
     boolean[][] visited;
    int[][] directions={{-1,0},{1,0},{0,1},{0,-1}};
   int m; int n;
    public boolean exist(char[][] board, String word) {
        m=board.length;
        n=board[0].length;
        visited=new boolean[m][n];
       for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(board[i][j]==word.charAt(0)){
               if( check(board,i,j,word,0)){ return true;} 
            }
        }
       }
        return false;
}

public boolean check(char[][] board,int r,int c ,String word ,int k){
              if(k==word.length()){return true;}
              if(r>=m || r<0 || c>=n ||c<0 || visited[r][c]==true || board[r][c]!=word.charAt(k)){
                return false;
              }
              visited[r][c]=true;
              for(int[] d:directions){
                 if(check(board,r+d[0], c+d[1], word,k+1)) {return true;};
              }

              visited[r][c]=false;
              return false;

}

}