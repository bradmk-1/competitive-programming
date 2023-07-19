/**
 * https://leetcode.com/problems/design-a-stack-with-increment-operation
 * 
 * @param {number} maxSize
 */

class CustomStack {
    
    constructor(maxSize) {
        this.stack = [];
        this.maxSize = maxSize;
    }

    push(x) {
        if (this.stack.length < this.maxSize) {
            this.stack.push(x);
        }  
    };

    pop() {
        if (this.stack.length !== 0) {
             return this.stack.pop()
        } else {
            return -1;
        };
    };

    increment(k, val) {
        if (this.stack.length < k) {
            for (let i = 0; i < this.stack.length; i++) {
                this.stack[i] = this.stack[i] + val;
            }
        } else {
            for (let i = 0; i < k; i++) {
                this.stack[i] = this.stack[i] + val;
            }
        };
    };


}


/** 
 * Your CustomStack object will be instantiated and called as such:
 * var obj = new CustomStack(maxSize)
 * obj.push(x)
 * var param_2 = obj.pop()
 * obj.increment(k,val)
 */