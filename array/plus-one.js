/**
 * https://leetcode.com/problems/plus-one/submissions/
 * 
 * @param {number[]} digits
 * @return {number[]}
 */
 const plusOne = (digits) => {
    let incrementedNum = BigInt(digits.join(''));
    return (++incrementedNum).toString().split('');
};