class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        tracker = set()

        for i in nums:
            if i in tracker:
                return True
            else:
                tracker.add(i)
    
        return False



        