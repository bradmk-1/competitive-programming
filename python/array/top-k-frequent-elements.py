import heapq

class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        count = {}
        for i in nums:
            if i in count:
                count[i] = count[i] + 1
            else:
                count[i] = 1
        
        countToList = [(value, key) for key, value in count.items()]
        heapq.heapify(countToList)
        firstk = heapq.nlargest(k, countToList)
        return [val[1] for val in firstk]