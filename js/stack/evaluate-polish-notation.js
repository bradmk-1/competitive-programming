/**
 * https://leetcode.com/problems/evaluate-reverse-polish-notation
 * 
 * @param {string[]} tokens
 * @return {number}
 */
const evalRPN = (tokens) => {
    const stack = [];
    const operators = ['+', '-', '*', '/'];


    for (let i = 0; i < tokens.length; i++) {
        if (!operators.includes(tokens[i])) {
            stack.push(Number(tokens[i]));
        } else {
            const second = stack.pop();
            const first = stack.pop();

            if (tokens[i] === "+") { 
                stack.push(first + second);
            }

            if (tokens[i] === "-") { 
                stack.push(first - second);
            }

            if (tokens[i] === "*") { 
                stack.push(first * second);
            }

            if (tokens[i] === "/") { 
                stack.push(Math.trunc(first / second));
            }
        }
    };

    return stack;
}
