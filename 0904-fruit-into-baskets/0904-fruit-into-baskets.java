class Solution {
    public int totalFruit(int[] fruits) {
        HashMap< Integer,Integer> mp=new HashMap<>();
        int left=0; int right=0; int ans=0;
        while(right<fruits.length){

            while(mp.size()>2){
                mp.put(fruits[left],mp.get(fruits[left])-1);
                if(mp.get(fruits[left])==0){
                    mp.remove(fruits[left]);
                }
                left++;
            }

        mp.put(fruits[right],mp.getOrDefault(fruits[right],0)+1);
        if(mp.size()<=2){
            ans=Math.max(ans,right-left+1);
        }
        right++;
        }
        return ans;
    }
}