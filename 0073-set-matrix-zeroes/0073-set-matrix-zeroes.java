class Solution {
    public void setZeroes(int[][] matrix) {
        int m= matrix.length;
        int n= matrix[0].length;
        ArrayList<int[]> list=new ArrayList<>();
        for (int i=0;i<m;i++){
            for( int j=0;j<n;j++){
                if(matrix[i][j]==0){
                list.add(new int[]{i,j});
                }
            }
        }
        for(int[] l: list){
            changerow(l[0],matrix);
            changecol(l[1] ,matrix);
        } 
    }
    void changerow(int i,int[][] matrix){
        int n= matrix[0].length;
         for(int j=0;j<n;j++){
            matrix[i][j]=0;
         }
    }
    void changecol(int j,int[][] matrix){
         int m= matrix.length;
         for(int i=0;i<m;i++){
            matrix[i][j]=0;
         }
    }
}