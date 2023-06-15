/**
 * https://leetcode.com/problems/matrix-diagonal-sum
 * 
 * @param {number[][]} mat
 * @return {number}
 */
const diagonalSum = (mat) => {
    let count = 0;

    for (i = 0; i < mat.length; i++) {
        count += mat[i][i];
        count += mat[i].reverse()[i];
    };

    const numberToRemove = mat[Math.floor(mat.length / 2)][Math.floor(mat[0].length / 2)];
    if (mat.length % 2 === 0 && mat.length !== 1) {
        return count;
    } else {
        return count - numberToRemove;
    }
};
