class Solution {
    public int maxDistance(int[] colors) {
        int i=0; 
        int j=colors.length-1;
        int max=0;
        while(i<j){
            if(colors[i]!=colors[j]){
                max=Math.max(max,(j-i));
            }
        j--;
        }
        int start=0;
        int end=colors.length-1;
        while(start<end){
           if(colors[start]!=colors[end]){
                max=Math.max(max,(end-start));
            }
        start++;
        }
        return max;
    }
}