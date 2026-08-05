class Solution(object):
    def remainingMethods(self, n, k, invocations):
        """
        :type n: int
        :type k: int
        :type invocations: List[List[int]]
        :rtype: List[int]
        """
        graph=[[] for i in range(n)]
        in_degree=[0]*n
        sus=[0]*n

        for u,v in invocations:
            graph[u].append(v)
            in_degree[v]+=1

        visited=[False]*n
    
        q=deque()
        q.append(k)
        sus[k]=1
        visited[k]=True

        while q:
                curr=q.popleft()
                for i in graph[curr]:
                    if visited[i]!=True:
                        q.append(i)
                        visited[i]=True
                        sus[i]=1
                    in_degree[i]-=1
                
        for i in range(n):
            if sus[i]==1 and in_degree[i]>0:
                return list(range(n))
        ans=[]
        for i in range(n):
            if sus[i]==0:
                ans.append(i)
        return ans
                

        