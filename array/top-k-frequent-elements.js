/**
 * https://leetcode.com/problems/top-k-frequent-elements
 * 
 * @param {number[]} nums
 * @param {number} k
 * @return {number[]}
 */
const topKFrequent = (nums, k) => {
    const numsCount = new Map();

    for (num of nums) {
        if (numsCount.has(num)) {
            numsCount.set(num, numsCount.get(num) + 1);
        } else {
            numsCount.set(num, 1);
        }
    };
    return Array.from(numsCount).sort((a, b) => b[1] - a[1]).slice(0, k).map(el => el[0]);
};

//Maybe I can do this???
//Had to learn about prio queues (abstract) and heap implementations
//However my approach is O(n log n), will iterate on this for optimal solution
