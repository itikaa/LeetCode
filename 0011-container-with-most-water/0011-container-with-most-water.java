class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int n=height.length;
        int r=n-1;
        int max=0;
        int h=0;
        while(l<r){
            if(height[l]<height[r]){
                h=height[l];
            }
            else{ h=height[r]; }
            int width=r-l;
           max=Math.max(max,width*h);
           if( height[l]<height[r]){
            l++;
           }
           else{
            r--;
           }
        }
        return max;
    }
}