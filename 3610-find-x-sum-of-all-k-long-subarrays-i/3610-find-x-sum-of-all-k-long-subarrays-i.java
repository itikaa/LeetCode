class Solution {
    int[] result;int k=0;
    public int[] findXSum(int[] nums, int k, int x) {
        int n=nums.length;
         result= new int[n-k+1];
        HashMap<Integer,Integer> mp=new HashMap<>();
        int l=0; int r=0;
        while(r<n){
        mp.put(nums[r],mp.getOrDefault(nums[r],0)+1);
        while(l<r && r-l+1>k){
            mp.put(nums[l],mp.get(nums[l])-1);
            if(mp.get(nums[l])==0){ mp.remove(nums[l]);}
            l++;
        }
        if(r-l+1==k){
            find(mp,x);
        }
        r++;
        }
        return result;

    }

    public void find(HashMap<Integer,Integer> mp,int x){
        PriorityQueue<int[]> pq =new PriorityQueue<>((a,b)-> {
        if(b[1]==a[1]){
           return b[0]-a[0];
        }
        return b[1]-a[1];
        }
        );

        for(Map.Entry<Integer,Integer> e:mp.entrySet()){
            pq.offer(new int[]{e.getKey(),e.getValue()});
        }
          
         int sum=0;
         while(x-->0 && !pq.isEmpty()){
            int[] top=pq.poll();
            int ele=top[0];
            int freq=top[1];
            sum+=(ele*freq);
         }
          result[k++]=sum;
    }
}