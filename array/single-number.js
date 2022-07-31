/**
 * https://leetcode.com/problems/single-number
 * 
 * @param {number[]} nums
 * @return {number}
 */
 const singleNumber = (nums) => {
    const numTracker = new Set();
    
    for (value of nums) {
        if (numTracker.has(value)) {
            numTracker.delete(value)
        } else {
            numTracker.add(value);
        };
    };
    return Array.from(numTracker)[0];
};