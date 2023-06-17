/**
 * https://leetcode.com/problems/find-lucky-integer-in-an-array
 * 
 * @param {number[]} arr
 * @return {number}
 */
const findLucky = (arr) => {
    const intMap = new Map();

    for (value of arr) {
        if (intMap.has(value)) {
            intMap.set(value, intMap.get(value) + 1);
        } else {
            intMap.set(value, 1);
        }
    };

    let largestValue = -1;
    for ([key, value] of intMap) {
        if (key === value && value > largestValue) {
           largestValue = value;
        }
    };
    return largestValue;
};