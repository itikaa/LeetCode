class Solution {
    public int[][] merge(int[][] intervals) {
      Arrays.sort(intervals,Comparator.comparingInt(a->a[0]));
      List<int[]> ans= new ArrayList<>();
      int s=intervals[0][0];
      int e=intervals[0][1];

      for(int i=1; i<intervals.length; i++){
          int check=intervals[i][0];
          if(check<=e){
              e=Math.max(e,intervals[i][1]);
           }
           else{
            ans.add(new int[]{s,e});
            s=intervals[i][0];
            e=intervals[i][1];
           }
          
      }
      ans.add(new int[]{s,e});
      return ans.toArray(new int[ans.size()][]);
    }
}