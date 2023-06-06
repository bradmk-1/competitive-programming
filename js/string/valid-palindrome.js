/**
 * https://leetcode.com/problems/valid-palindrome/
 * 
 * @param {string} s
 * @return {boolean}
 */
const isPalindrome = (s) => {
    const cleanedString = s.toLowerCase().replace(/[^a-zA-Z0-9]/g, "");
    
    if (cleanedString.split('').reverse().join('') === cleanedString) {
        return true;
    };
    
    return false;
};