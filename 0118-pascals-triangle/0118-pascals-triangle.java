class Solution {
    public List<List<Integer>> generate(int numRows) {
        int n=numRows;
        List<List<Integer>> result =new ArrayList<>();
        result.add(Arrays.asList(1));
        if(n>1){ result.add(Arrays.asList(1,1)); }
        for(int i=2;i<n;i++){
            List<Integer> l=new ArrayList<>();
            l.add(1);
            List<Integer> add= result.get(i-1);
            for(int j=0;j<i-1;j++){
              int sum= add.get(j)+add.get(j+1);
              l.add(sum);
            }

            l.add(1);
            result.add(l);
        }
        return result;
    }
}