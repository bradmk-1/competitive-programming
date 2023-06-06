/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock
 * 
 * @param {number[]} prices
 * @return {number}
 */

const maxProfit = (prices) => {
    let lowestDay = Infinity;
    let highestDay = 0;
    
    for (i = 0; i < prices.length; i++) {
        lowestDay = Math.min(lowestDay, prices[i]);
        highestDay = Math.max(highestDay, prices[i] - lowestDay);
    }
    
    return highestDay;

}; 


//Brute force with two for loops, for every value in prices calculate value - value[i] to the right of it
