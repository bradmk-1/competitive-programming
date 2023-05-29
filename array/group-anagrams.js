/**
 * https://leetcode.com/problems/group-anagrams
 * 
 * @param {string[]} strs
 * @return {string[][]}
 */
const groupAnagrams = (strs) => {
    const letterMap = new Map();

    for (str of strs) {
        const sortedStr = str.split('').sort().join('')

        if (!letterMap.has(sortedStr)) {
            letterMap.set(sortedStr, [str]);
        } else {
            letterMap.get(sortedStr).push(str);
        }
    };

    return Array.from(letterMap.values());
};

//Builds on the valid anagram question, we use same trick to find an anagram,
//then we have to use an ordered collection to group values together