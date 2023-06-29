/**
 * https://leetcode.com/problems/container-with-most-water
 * 
 * @param {number[]} height
 * @return {number}
 */
const maxArea = (height) => {

    let curr = 0;

    let lPtr = 0;
    let rPtr = height.length - 1;

    while (lPtr < rPtr) {
        const smallestSide = Math.min(height[lPtr], height[rPtr]);
        const volume = smallestSide * (rPtr - lPtr); 

        curr = Math.max(curr, volume);

        if (height[lPtr] < height[rPtr]) {
            lPtr++;
        } else {
            rPtr--;
        }
    };

   return curr;
};


//Same application as three sum apart from we don't need to sort.
//Key to problem is seeing that can caculate the volume of any two numbers by taking
//the smallest of two * the difference between the indexes