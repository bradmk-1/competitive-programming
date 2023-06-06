/**
 * https://leetcode.com/problems/contains-duplicate
 * 
 * @param {number[]} nums
 * @return {boolean}
 */
const containsDuplicate = (nums) => { 
    if ([...new Set(nums)].length < nums.length) {
        return true;
    }
    return false;
};