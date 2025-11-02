class Solution {
    int rows;int cols;
    int[][] directions={{-1,0},{0,1},{0,-1},{1,0}};
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        rows=m;cols=n;
        char grid[][] =new char[m][n];
        for(char[] row:grid){Arrays.fill(row,'0');}
        for(int[] g:guards){
                grid[g[0]][g[1]]='G';
            }
        
        for(int[] w:walls){
                grid[w[0]][w[1]]='W';
            }
        
        for(int[] g:guards){
            for(int[] d:directions){
             int r=g[0]+d[0]; int c=g[1]+d[1];
             while(r>=0 && r<rows && c>=0 && c<cols && grid[r][c]!='W' && grid[r][c]!='G'){
                grid[r][c]='1';
                r+=d[0]; c+=d[1];
             }
        }
        }

        int count=0;
        for(char[] row:grid){
            for(char c:row){
                if(c=='0'){
                    count++;
                }
            }
        }
        return count;

    }
}