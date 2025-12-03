class Solution {
    public int minMutation(String startGene, String endGene, String[] bank) {
        Queue<String> q=new LinkedList<>();
        ArrayList<String> visited=new ArrayList<>();
        Set<String> set = new HashSet<String>(); 
        for(String s : bank) set.add(s);

         if (!set.contains(endGene)) return -1;

        q.add(startGene);
        visited.add(startGene);
        int level=0;
         while(!q.isEmpty()){
               int n=q.size();
               if(n==0){return -1;}
               while(n-->0){
                  String curr=q.poll();
                  if(curr.equals(endGene) && set.contains(curr)){
                    return level;
                  }

                   char[] chars = {'A', 'C', 'G', 'T'};
                char[] currArr = curr.toCharArray();
                      for(int i=0;i<curr.length();i++){
                        char original=currArr[i];;
                         for(char ch:chars){
                          if(ch==original){continue;}
                         currArr[i]=ch;
                          String next = new String(currArr);

                        if(!visited.contains(next) && set.contains(next)){
                            q.add(next);
                            visited.add(next);
                          }
                             }
                              currArr[i] = original;
                   }

               }
         
       level++;

    }
    return -1;
    }
}