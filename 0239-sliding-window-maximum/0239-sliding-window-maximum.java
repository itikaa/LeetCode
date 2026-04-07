class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int index=0;
        Deque<Integer> q=new ArrayDeque<>();
        int[] result=new int[n-k+1];
        for(int i=0;i<k;i++){
             while(!q.isEmpty() && nums[q.peekLast()]<=nums[i]){
                q.pollLast();
             }
             q.offerLast(i);
        }
        result[index]=nums[q.peekFirst()];
     index++;
        for(int j=k;j<n;j++){
              if(q.peekFirst()<=j-k){
                q.pollFirst();
              }
            while(!q.isEmpty() && nums[q.peekLast()]<=nums[j]){
                q.pollLast();
             }
             q.offerLast(j);
              result[index]=nums[q.peekFirst()];
              index++;
        }

        return result;
    }
}