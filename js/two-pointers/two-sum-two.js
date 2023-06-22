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
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
const twoSumOptimized = (nums, target) => {
    const tracker = new Map();

    for (let i = 0; i < nums.length; i++) {
        const ntf = target - nums[i];
        
        if (tracker.has(ntf)) {
            return [i, tracker.get(ntf)];
        } else {
            tracker.set(nums[i], i);
        }
    };
};


//Two solutions I came to, second is optimal