//https://leetcode.com/problems/min-stack

class MinStack {
    stack = [];
    min = [];

    push(value) {
        this.stack.push(value);
        this.min.push(this.min.length === 0 ? value : Math.min(value, this.getMin()));
    };

    pop() {
        this.stack.pop();
        this.min.pop();
    };

    top() {
        return this.stack[this.stack.length - 1];
    };

    getMin() {
        return this.min[this.min.length - 1];
    };
}

/** 
 * Your MinStack object will be instantiated and called as such:
 * var obj = new MinStack()
 * obj.push(val)
 * obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.getMin()
 */