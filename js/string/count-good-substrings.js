/**
 * https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters
 * 
 * @param {string} s
 * @return {number}
 */
const countGoodSubstrings = (s) => {
    let subStrCount = 0;

    for (i = 0; i < s.length - 2; i++) {
        const subStr = new Set([s[i], s[i+1], s[i+2]]);
        if (subStr.size === 3) subStrCount++;
    };

    return subStrCount;
};