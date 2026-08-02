class Solution(object):
    def stoneGame(self, piles):
        """
        :type piles: List[int]
        :rtype: bool
        """
        n=len(piles)
        left=0
        right=n-1
        Alice=0
        Bob=0
        while left<right:
            if(piles[left]>=piles[right]):
                Alice+=piles[left]
                Bob+=piles[right]
            else:
                Alice+=piles[right]
                Bob+=piles[left]
            left+=1
            right-=1
        if(Alice>Bob):
            return True
        return False
        
            
        