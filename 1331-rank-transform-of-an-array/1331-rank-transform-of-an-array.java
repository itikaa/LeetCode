class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] a= arr.clone();
        Arrays.sort(a);
        HashMap<Integer,Integer> mp=new HashMap<>();
        int rank=1;
        for(int i:a){
           if(!mp.containsKey(i)){
            mp.put(i,rank);
            rank++;
           }
        }
   int[] ans=new int[arr.length];
   for(int i=0;i<arr.length;i++){
    ans[i]=mp.get(arr[i]);
   }
   return ans;
    }
}