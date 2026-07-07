class Solution(object):
    def removeCoveredIntervals(self, intervals):
        """
        :type intervals: List[List[int]]
        :rtype: int
        """
        intervals.sort(key=lambda x:(x[0],-x[1]))
        i=0
        while i<len(intervals)-1:
            i1=intervals[i]
            i2=intervals[i+1]
            if i2[0]>=i1[0] and i2[1]<=i1[1]:
                intervals.pop(i+1)
            else:
                i+=1
        return len(intervals)
        