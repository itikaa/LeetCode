class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int i=n1-1;
        int j=n2-1;
        int max=0;
        while(i>=0 && j>=0){
          if(nums1[i]<=nums2[j]){
            max=Math.max(max,(j-i));
            i--;
          }
          else if(j>i){
            j--;
          }
          else{
            i--; j--;
          }
        }
        return max;
    }
}