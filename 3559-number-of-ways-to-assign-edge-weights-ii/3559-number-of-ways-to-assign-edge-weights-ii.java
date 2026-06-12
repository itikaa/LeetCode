class Solution {
    int mod =1000000007;
    int depth[];
   int lift[][];
    public int[] assignEdgeWeights(int[][] edges, int[][] queries) {
        int n=edges.length+1;
        lift=new int[n+1][20];
         lift[1][0]=1;
        //Adjacency List--->TC O(n)

        HashMap<Integer,ArrayList<Integer>> mp=new HashMap<>();
        for(int[] e:edges){
            int u=e[0];
            int v=e[1];
            mp.putIfAbsent(u,new ArrayList<>());
            mp.putIfAbsent(v, new ArrayList<>());
            mp.get(u).add(v);
            mp.get(v).add(u);
        }

        //BFS---> TC O(n)

        depth =new int[mp.size()+1];
        Queue<Integer> q=new LinkedList<>();
         boolean[] visited=new boolean[n+1];
        q.offer(1);
        visited[1]=true;
         depth[1]=0;
        while(!q.isEmpty()){
            int size=q.size();
            int curr=q.poll();
            List<Integer> child= mp.get(curr);
            if(child==null) continue;
            for(int i:child){
                if(visited[i]==true) {continue;}
                q.offer(i);
                 visited[i]=true;
                 depth[i]=depth[curr]+1;
                 lift[i][0]=curr;
            }

        }

        //Lift array---> TC & OC both O(nlogn)
       for(int i=1;i<=n;i++){
        for(int j=1;j<18;j++){
            lift[i][j]=lift[lift[i][j-1]][j-1];
        }
       }

// TC =O(q logn)
      int[] ans=new int[queries.length];
      for(int k=0;k<queries.length;k++){
        int a=queries[k][0];
        int b=queries[k][1];
        int dist= depth[a]+depth[b]-2*depth[lca(a,b)];
        ans[k]= dist==0? 0:pow(2,dist-1);

      }
//total TC= O(nlogn+qlogn) 
//Sc=O(nlogn)
       return ans;

    }

    int lca(int a, int b){
      //a=lower depth  & b= higher depth
      if(depth[a] < depth[b]){
           return lca(b,a);
          }
          int diff= depth[a]-depth[b];
          for(int i=0;i<18;i++){
            if((diff & 1)==1){
               a=lift[a][i];
            }
            diff= diff>>1;
          }
          if(a==b) return a;


          for(int j=17;j>=0; j--){
            if(lift[a][j]!= lift[b][j]){
                   a=lift[a][j];
                   b=lift[b][j];
            }
          }
          return lift[a][0];
    }

    int pow(int base , int exp){
       long b=base%mod;
       long res=1;
       while(exp>0){
           if((exp & 1)==1){
                res= res* b%mod;
                           }
           b=b*b%mod;
           exp=exp>>1;
       }
       return (int) res;
    }
}