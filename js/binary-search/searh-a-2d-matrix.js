/**
 * https://leetcode.com/problems/search-a-2d-matrix
 * 
 * @param {number[][]} matrix
 * @param {number} target
 * @return {boolean}
 */

const bSearch = (nums, target) => {
    if (nums.length === 1 && nums[0] !== target) {
        return false;
    }

    let left = 0;
    let right = nums.length - 1;
    
    while (left <= right) {
        let mid = Math.floor((left + right) / 2);
        if (nums[mid] > target) {
            right = mid - 1;
        } else if (nums[mid] < target) {
            left = mid + 1;
        } else {
            return true;
        }
    };
    return false;
}

const searchMatrix = (matrix, target) => {
    for (const subset of matrix) {
        if (bSearch(subset, target) === true) {
            return true;
        }
    }
    return false;
};