/**
 * https://leetcode.com/problems/3sum
 * 
 * @param {number[]} nums
 * @return {number[][]}
 */
const threeSum = (nums) => {
    const triplets = []
    const sortedNums = nums.sort((a, b) => a - b);

    for (i = 0; i < sortedNums.length; i++) {

        if (i !== 0 && sortedNums[i] === sortedNums[i - 1]) continue;

        let lPtr = i + 1;
        let rPtr = sortedNums.length - 1;

        while (lPtr < rPtr) {
            if (sortedNums[i] + sortedNums[lPtr] + sortedNums[rPtr] === 0) {
                triplets.push([sortedNums[i], sortedNums[lPtr], sortedNums[rPtr]])
                lPtr++;
                while (sortedNums[lPtr] === sortedNums[lPtr - 1]) lPtr++;
            } else if (sortedNums[i] + sortedNums[lPtr] + sortedNums[rPtr] > 0) {
                rPtr--;
            } else {
                lPtr++;
            }
        };
    };
 
    return triplets;
};


//Took a few attempts, key is to solve two sum + two sum two before
//Main concept is that sorting array o(n log n) means finding and skipping
//duplicates is easy (check behind current index since sorted)