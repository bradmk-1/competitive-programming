/**
 * https://leetcode.com/problems/valid-parentheses/
 * 
 * @param {string} s
 * @return {boolean}
 */
const isValid = (s) => {
    if (s.length % 2 === 1) return false;

    const lookupTable = {
        '(': ')',
        '{': '}',
        '[': ']',
    };


    const symbolStack = [];

    for (symbol of s) {
        if (symbol === '(' || symbol === '{' || symbol === '[') {
            symbolStack.push(symbol);
        } else if (lookupTable[symbolStack.pop()] !== symbol) {
                return false;
            }   
    };

    if (symbolStack.length === 0) {
        return true;
    } else {
        return false;
    }
};