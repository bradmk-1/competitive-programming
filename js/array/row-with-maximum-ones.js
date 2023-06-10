/**
 * https://leetcode.com/problems/row-with-maximum-ones
 *
 * @param {number[][]} mat
 * @return {number[]}
 */
const rowAndMaximumOnes = (mat) => {
    const matMap = new Map();

    for (let i = 0; i < mat.length; i++) {
        const onesCount = mat[i].reduce((acc, curr) => curr === 1 ? acc += 1 : acc);
        matMap.set(i, onesCount);
    };

    return Array.from(matMap).sort((a, b) => b[1] - a[1])[0];
};
