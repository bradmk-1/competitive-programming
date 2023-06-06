/**
 * https://leetcode.com/problems/product-of-array-except-sel
 * 
 * @param {number[]} nums
 * @return {number[]}
 */
const productExceptSelf = (nums) => {
    let product = 1;
    const prefix = [];
    const suffix = [];
    const output = [];
    
    for (num of nums) {
        prefix.push(product);
        product *= num;
    };

    product = 1;

    for (let i = nums.length - 1; i >= 0; i--) {
        suffix.unshift(product);
        product *= nums[i];
    };

    
    for (let j = 0; j < prefix.length; j++) {
        output[j] = prefix[j] * suffix[j];
    };

    return output;
}


//Mind bending problem as we aren't allowed to divide + must be O(n) time
//My solution is to calculate the sum of the prefix and suffix of each value (sum of values behind and in front of chosen number)
//O(n) time
//If we could divide, you could do the product of the array divided by each value.