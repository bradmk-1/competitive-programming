class Solution:
    def isPalindrome(self, s: str) -> bool:
        start_ptr = 0
        end_ptr = len(s) - 1

        while start_ptr < end_ptr:
            if (s[start_ptr].isalnum() == False): 
                start_ptr += 1
                if (s[end_ptr].isalnum() == False):
                    end_ptr -= 1
                continue
                
            if (s[end_ptr].isalnum() == False): 
                end_ptr -= 1
                if (s[start_ptr].isalnum() == False):
                    start_ptr += 1
                continue
            
            if (s[start_ptr].lower() == s[end_ptr].lower()):
                start_ptr += 1
                end_ptr -= 1
            else:
                return False

        return True

            
# https://leetcode.com/problems/valid-palindrome/