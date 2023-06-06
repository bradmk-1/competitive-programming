/**
 * https://leetcode.com/problems/valid-anagram
 * 
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
const isAnagram = (s, t) => {
    if (s.length !== t.length) return false;

    const letterCount = new Map();
    const secondletterCount = new Map();

    for (letter of s) {
        if (letterCount.has(letter)) {
            const updatedCount = letterCount.get(letter) + 1;
            letterCount.set(letter, updatedCount);
        } else {
            letterCount.set(letter, 1);
        }
    };

        for (letter of t) {
        if (secondletterCount.has(letter)) {
            const updatedCount = secondletterCount.get(letter) + 1;
            secondletterCount.set(letter, updatedCount);
        } else {
            secondletterCount.set(letter, 1);
        }
    };

    for ([key, value] of letterCount) {
        if (secondletterCount.get(key) !== value) {
            return false;
        }
    };

    return true;
};

//Mapping works like this, but this can be solved smarter and with less space 
//by sorting and splitting the strings, then one loop to check values match at 
//each step