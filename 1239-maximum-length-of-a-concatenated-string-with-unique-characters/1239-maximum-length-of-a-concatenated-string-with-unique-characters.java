class Solution {
    public int maxLength(List<String> arr) {
        
        String temp="";
        int n=arr.size();
      return solve(0,arr,temp,n);
    }

int solve(int i,List<String> arr, String temp,int n ){
     if(i>=n){
     return temp.length();
     }
     int include=0; 
     int exclude=0;
     if(duplicate(arr.get(i),temp)){
        exclude=solve(i+1,arr,temp,n);
     }
     else{
        exclude=solve(i+1,arr,temp,n);
        include=solve(i+1,arr,temp+arr.get(i),n);
     }
     return Math.max(include,exclude);

}

     boolean duplicate(String s , String p){
        int[] count=new int[26];
        int n=s.length();
    for(int i=0;i<n;i++){
        if(count[s.charAt(i)-'a']>0){
            return true;
        }
         count[s.charAt(i)-'a']++;
    }

    for(int j=0;j<p.length();j++){
         if(count[p.charAt(j)-'a']>0){
            return true;
         }
    }
    return false;
}

}