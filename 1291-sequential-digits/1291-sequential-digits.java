class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        ArrayList<Integer> possible=new ArrayList<>();
        for(int i=1;i<9;i++){
            int num=i;
            for(int j=i+1;j<=9;j++){
                    num=num*10+j;
                    possible.add(num);
            }
            
        }
         List<Integer> ans = new ArrayList<>();
        Collections.sort(possible);
        for(int i=0;i<possible.size();i++){
            int p=possible.get(i);
            if(p>=low && p<=high){
                ans.add(p);
            }
        }
        return ans;
    }
}