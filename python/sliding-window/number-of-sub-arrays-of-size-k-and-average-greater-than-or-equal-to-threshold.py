class Solution:
    def numOfSubarrays(self, arr: List[int], k: int, threshold: int) -> int:
        total = 0

        running_total = 0
        for r in range(len(arr)):
            running_total += arr[r]

            if r >= k - 1:
                if running_total / k >= threshold:
                    total += 1
            
                running_total -= arr[(r + 1) - k]
            
        return total
                

                
# https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/