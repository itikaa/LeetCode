class Solution {
    public int orangesRotting(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int fresh=0;
        int minutes=0;
         Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                    if(grid[i][j]==2){q.offer(new int[]{i,j});}
                    if(grid[i][j]==1){fresh++;}
            }
        }
       
        while(!q.isEmpty() && fresh>0){
            int size=q.size();
            minutes++;
            for(int k=0;k<size;k++){
                int[] curr=q.poll();
                int i=curr[0];
                int j=curr[1];
                if((i-1)>=0 && grid[i-1][j]==1){ grid[i-1][j]=2 ; q.offer(new int[]{i-1,j}); fresh--;}
                if((i+1)<m && grid[i+1][j]==1){ grid[i+1][j]=2 ; q.offer(new int[]{i+1,j}); fresh--; }
                if((j-1)>=0 && grid[i][j-1]==1){ grid[i][j-1]=2 ; q.offer(new int[]{i,j-1}); fresh--;}
                if((j+1)<n && grid[i][j+1]==1){grid[i][j+1]=2 ; q.offer(new int[]{i,j+1}); fresh--;}
            }
        }
        if(fresh!=0){return -1;}
        return minutes;
    }
}