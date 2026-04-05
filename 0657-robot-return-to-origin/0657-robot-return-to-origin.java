class Solution {
    public boolean judgeCircle(String moves) {
        int i=0; 
        int j=0;
     for(int k=0;k<moves.length();k++){
        char c= moves.charAt(k);
        if(c=='U'){
            j++;
        }
        else if(c=='D'){
            j--;
        }
        else if(c=='L'){
            i--;
        }
        else{
            i++;
        }
     }
     if(i==0 && j==0){
        return true;
     }
     return false;
    }
}