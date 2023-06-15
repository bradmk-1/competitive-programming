/**
 * https://leetcode.com/problems/longest-consecutive-sequence
 * 
 * @param {number[]} nums
 * @return {number}
 */
const longestConsecutive = (nums) =>  {

    if (!nums.length) return 0;

    const uniqueNums = new Set(nums);
    let count = 1;
    let maxSeq = 1;

    for (value of uniqueNums) {
        let curr = value
        if (uniqueNums.has(curr - 1)) {
            continue;
        } else {
            while (uniqueNums.has(curr + 1)) {
                count++;
                curr++;
            };

            maxSeq = Math.max(maxSeq, count);
            count = 1;
        }
    };
    return maxSeq;
};