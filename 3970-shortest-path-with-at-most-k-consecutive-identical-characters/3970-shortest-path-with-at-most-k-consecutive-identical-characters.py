import heapq
class Solution(object):
    def shortestPath(self, n, edges, labels, k):
        """
        :type n: int
        :type edges: List[List[int]]
        :type labels: str
        :type k: int
        :rtype: int
        """
        adj=[[] for _ in range (n)]

        #make adjacency list 
        for u,v,w in edges:
            adj[u].append((v,w))

        dist = [[float('inf')] * (k + 1) for _ in range(n)]

        # ditance , node, remaining K
        pq=[(0,0,k)]
        dist[0][k]=0

        while pq:
            d,u,rem= heapq.heappop(pq)

            if d!=dist[u][rem]:
                continue
            for v,w in adj[u]:

                if labels[u]==labels[v]:
                    new_rem=rem-1
                else:
                    new_rem=k

                if new_rem<=0:
                    continue

                nd=d+w
                if nd<dist[v][new_rem]:
                    dist[v][new_rem]=nd
                    heapq.heappush(pq,(nd,v,new_rem))
        ans=float("inf")
        for i in range(0,k+1):
            ans=min(ans,dist[n-1][i])
        
        if ans!=float("inf"):
            return ans
        return -1



     
                




        