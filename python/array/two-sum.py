class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        tracker = {}
        for i, v in enumerate(nums):
            ntf = target - v
            if ntf in tracker:
                return [i, tracker.get(ntf)]
            else:
                tracker[v] = i