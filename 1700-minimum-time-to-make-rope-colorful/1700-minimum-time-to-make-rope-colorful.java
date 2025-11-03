class Solution {
    public int minCost(String colors, int[] neededTime) {
        int min=-1;int sum=0;
        for(int i=0;i<neededTime.length-1;i++){
            if(colors.charAt(i)==colors.charAt(i+1)){
                if(min==-1){min=neededTime[i];}
                if(neededTime[i+1]<min){
                    sum+=neededTime[i+1];
                }
                else{sum+=min; min=neededTime[i+1];}
            }
            else{min=-1;}
        }
        return sum;
    }
}