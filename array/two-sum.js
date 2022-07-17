/**
 * https://leetcode.com/problems/two-sum/
 * 
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
const twoSum = (nums, target) => {
    const iteratedNums = new Map();
    
    for (i=0; i <= nums.length; i++) {
        const valueToFind = target - nums[i]
        
        if (iteratedNums.has(valueToFind)) {
            return [iteratedNums.get(valueToFind), i];
        } else {
            iteratedNums.set(nums[i], i);
        }        
    };
    
}