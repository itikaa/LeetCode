class Solution(object):
    def maxProduct(self, n):
        """
        :type n: int
        :rtype: int
        """
        first=float('inf')
        second=float('inf')
        while n>0:
            digit=n%10
            n/=10
            if digit>second and first!=float('inf'):
                if digit>first:
                    second=first
                    first=digit
                else:
    
                        second=digit
                   
            elif second!=float('inf') and first==float('inf'):
                if second>digit:
                    first=second
                    second=digit

                else:
                    first=digit

            elif second==float('inf'):
                second=digit
        return first*second
        