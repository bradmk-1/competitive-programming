/**
 * https://leetcode.com/problems/find-the-array-concatenation-value
 * 
 * @param {number[]} nums
 * @return {number}
 */
const findTheArrayConcVal = function(nums) {
    let concat = 0;
    let lPtr = 0;
    let rPtr = nums.length - 1;

    while (lPtr <= rPtr) {
        if (lPtr === rPtr) {
            concat += Number("" + nums[lPtr]);
        } else {
            concat += Number("" + nums[lPtr] + nums[rPtr]);
        }
        lPtr++;
        rPtr--;
    };

    

    return concat;
};