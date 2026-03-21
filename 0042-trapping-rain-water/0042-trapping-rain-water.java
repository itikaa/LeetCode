class Solution {
    public int trap(int[] height) {
        int lmax=0;
        int rmax=0;
        int result=0;
        int l=0; int r=height.length-1;
        while(l<r){
            lmax=Math.max(height[l],lmax);
            rmax=Math.max(rmax,height[r]);
            if(height[l]<=height[r]){
                result+=(lmax-height[l]);
                l++;
            }
            else{
                result+=(rmax-height[r]);
                r--;
            }
        }
        return result;
    }
}