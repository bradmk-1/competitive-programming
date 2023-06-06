/**
 *https://leetcode.com/problems/island-perimeter
 *
 * @param {number[][]} grid
 * @return {number}
 */
const islandPerimeter = (grid) => {
    let perimCount = 0;

    for (let i = 0; i < grid.length; i++) {
        for (let j = 0; j < grid[i].length; j++) {
            if (grid[i][j] === 1) {
                if (!grid?.[i]?.[j + 1]) {
                    perimCount++
                } 
                if (!grid?.[i]?.[j - 1]) {
                    perimCount++
                } 
                if (!grid?.[i + 1]?.[j]) {
                    perimCount++
                }
                if (!grid?.[i + 1]?.[j]) {
                    perimCount++
                }
            }
        };
    };
    return perimCount;
};


//Marked as easy + array but actually a graph problem presented via arrays
//Came up with solution in 30min ish, not bad considering it was a graph problem solvable with DFS / BFS