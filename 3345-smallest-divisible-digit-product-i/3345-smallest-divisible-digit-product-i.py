class Solution(object):
    def smallestNumber(self, n, t):
        """
        :type n: int
        :type t: int
        :rtype: int
        """
        ans=float('inf')
        i=n
        while(ans==float('inf')):
            if(self.digit_product(i)%t==0):
                ans=i
                break
            i+=1
        return ans

    def digit_product(self,N):
        product=1
        while N>0:
            digit=N%10
            product*=digit
            N/=10
        return product


        