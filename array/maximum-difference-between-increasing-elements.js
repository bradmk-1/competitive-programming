/**
 * https://leetcode.com/problems/maximum-difference-between-increasing-elements/submissions/
 * 
 * @param {number[]} nums
 * @return {number}
 */
const  maximumDifference = (nums) => {
    let lowest = Infinity;
    let highest = 0
    
    for (const value of nums) {
        lowest = Math.min(lowest, value);
        highest = Math.max(highest, value - lowest);
    };
    
    return highest === 0 ? -1 : highest;
};

//Very similar to best time to buy and sell stocks, can be brute forced via two foor loops checking every values combinations to the right of it