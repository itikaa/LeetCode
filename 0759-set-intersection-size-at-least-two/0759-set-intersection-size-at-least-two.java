class Solution {
    public int intersectionSizeTwo(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->{
            if(a[1]==b[1]){return b[0]-a[0];}
            else return a[1]-b[1];
        });
        int n=intervals.length;
        int count=0;
       int first=-1; int second=-1;
        for(int i=0;i<n;i++){
             int start=intervals[i][0];
             int end=intervals[i][1];

             if(start>first){
                first=end;
                second=end-1;
                count+=2;
             }
             else if(start>second){
                count+=1;
                second=first;
                first=end;
             }
        }
        return count;
    }
}