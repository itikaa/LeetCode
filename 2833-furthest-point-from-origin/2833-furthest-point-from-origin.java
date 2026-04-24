class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int left=0; 
        int right=0; int count=0;
        for(int i=0;i<moves.length();i++){
            char c=moves.charAt(i);
            if(c=='L'){
                left++;
            }
            else if(c=='R'){
                right++;
            }
            else{
                count++;
            }
        }
        int diff=Math.abs(left-right);
        return  count+diff;
    }
}