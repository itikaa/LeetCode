class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int K=k-1;
        int i=x;
        int m=x+K;
        while(i<=m){
        for(int j=y;j<=y+K;j++){
            int temp=grid[i][j];
            grid[i][j]=grid[m][j];
            grid[m][j]=temp;
        }
        i++;
        m--;
        }
        return grid;
    }
}