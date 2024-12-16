class Solution:
    def longestOnes(self, nums: List[int], k: int) -> int:
        longest = 0
        l = 0 

        chars_seen = {}
        for r in range(len(nums)):
            if nums[r] in chars_seen:
                chars_seen[nums[r]] += 1
            else:
                chars_seen[nums[r]] = 1
        
            while 0 in chars_seen and chars_seen[0] > k:
                chars_seen[nums[l]] -= 1
                l += 1
                
            longest = max(longest, r - l + 1)


        return longest

            


        