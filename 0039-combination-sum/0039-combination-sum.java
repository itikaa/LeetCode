class Solution {
     List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
         List<Integer> current=new ArrayList<>();
         find(candidates, target,0,0,current);
         return ans;
    }
    public void find(int[] candidates, int target, int index, int sum, List<Integer>current ){
        if(index==candidates.length || sum>target){
            return;
        }
    if(sum==target){
    ans.add(new ArrayList<>(current));
    return ;
    }
    //pick
    sum+=candidates[index];
    current.add(candidates[index]);
    find(candidates, target, index, sum,current);

    //not pick  
    sum-=candidates[index];
    current.remove(current.size()-1);
    find(candidates, target, index+1, sum,current);
    }

}