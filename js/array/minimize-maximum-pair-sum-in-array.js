/**
 * https://leetcode.com/problems/minimize-maximum-pair-sum-in-array
 * 
 * @param {number[]} nums
 * @return {number}
 */
const minPairSum = (nums) => {
    let max = 0;
    const sortedNums = nums.sort((a, b) => a - b);

    for (let i = 0; i < sortedNums.length; i++) {
        const summedPair = sortedNums[i] + sortedNums.pop();
        max = Math.max(max, summedPair);
    };
    return max;
};