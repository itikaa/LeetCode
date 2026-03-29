class Solution {
    public int reversePairs(int[] nums) {

    return mergesort(nums,0,nums.length-1);
    }
    
    public int mergesort(int[] nums, int low, int high){
        if(low>=high){return 0;}
        int count=0;
        int mid=low+(high-low)/2;
        count+=mergesort(nums,low,mid);
       count+= mergesort(nums,mid+1,high);
       count+= countPairs(nums, low, mid ,high);
        merge(nums,low,mid,high);
        return count;
         }

         public void merge(int[] nums, int low, int mid, int high){
         List<Integer> temp=new ArrayList<>();
            int j=mid+1;
            int i=low;
            while(i<=mid && j<=high){
                         if(nums[i]<nums[j]){
                        temp.add(nums[i++]);
                         }
                         else{
                            temp.add(nums[j++]);
                         }
            }
            while(i<=mid){
                temp.add(nums[i++]);
            }
            while(j<=high){
                temp.add(nums[j++]);
            }
            for (int k = low; k<=high; k++) {
           nums[k] = temp.get(k-low);
       }
         }

         int countPairs(int[] nums, int low, int mid, int high){
            int count=0;
             int right=mid+1;
            for(int i=low;i<=mid;i++){
                while(right<=high && (long)nums[i]>nums[right]*2L){
                    right++;
                }
                count+=(right-(mid+1));
            }
            return count;
         }
}