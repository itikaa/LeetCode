class Solution {
    public int minMoves(int[] nums, int limit) {
        int[] check=new int[2*limit+2];
        int low=0; 
        int high=nums.length-1;
        while(low<high){
            check[2]+=2;
            check[limit*2+1]-=2;
     
     int a=Math.min(nums[low], nums[high]);
     int b=Math.max(nums[low], nums[high]);

     check[1+a]-=1;
     check[b+limit+1]+=1;

     check[a+b]-=1;
     check[a+b+1]+=1;

     low++; high--;
        }

        int moves=0; 
        int ans=Integer.MAX_VALUE;
        for(int j=2;j<=2*limit;j++){
            moves+=check[j];
            if(moves<ans){
                ans=moves;
            }
        }
        return ans;
    }
}