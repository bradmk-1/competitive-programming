/**
 * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted
 * 
 * @param {number[]} numbers
 * @param {number} target
 * @return {number[]}
 */
const twoSumBruteForce = function(numbers, target) {
    for (let i = 0; i < numbers.length; i++) {
        for (let j = i + 1; j < numbers.length; j++) {
            if (target - numbers[i] === numbers[j]) {
                return [i + 1, j + 1];
            }
        };
    };
};

/**
 * 
 * 
 * @param {number[]} numbers
 * @param {number} target
 * @return {number[]}
 */
const twoSumOptimized = function(numbers, target) {
    let lPtr = 0;
    let rPtr = numbers.length - 1;

    while (lPtr < rPtr) {
        if (numbers[lPtr] + numbers[rPtr] === target) {
            return [lPtr + 1, rPtr + 1];
        } else if (numbers[lPtr] + numbers[rPtr] > target) {
            rPtr--;
        } else {
            lPtr++;
        }
     };
    
};


//Two solutions I came to, second is optimal