class Solution {
    public int[][] merge(int[][] intervals) {
        int n=intervals.length;
        Arrays.sort(intervals,Comparator.comparingInt(i->i[0]));
        List<int[]> result=new ArrayList<>();
        int i=0; int k=0;
        while(i<intervals.length){
            int s=intervals[i][0];
            int e=intervals[i][1];
            if(i+1<n){ k=i+1;}
            while(k<n && intervals[k][0]<=e){
                e=Math.max(intervals[k][1],e);
                k++;
            }
            result.add(new int[]{s,e});
            i=k;
        }
        return result.toArray(new int[result.size()][]);
    }
}