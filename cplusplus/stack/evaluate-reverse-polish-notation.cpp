class Solution {
public:
    int evalRPN(vector<string>& tokens) {
        stack<int> tracker{};

        for (auto token : tokens) {
            if (token == "+") {
                int top{ tracker.top() };
                tracker.pop();
                int res = tracker.top() + top;
                tracker.pop();
                tracker.push(res);
            }
            else if (token == "-") {
                int top{ tracker.top() };
                tracker.pop();
                int res = tracker.top() - top;
                tracker.pop();
                tracker.push(res);
            }
            else if (token == "*") {
                int top{ tracker.top() };
                tracker.pop();
                int res = tracker.top() * top;
                tracker.pop();
                tracker.push(res);
            }
            else if (token == "/") {
                int top{ tracker.top() };
                tracker.pop();
                int res = tracker.top() / top;
                tracker.pop();
                tracker.push(res);
            }
            else {
                tracker.push(stoi(token));
            }
        }
        return tracker.top();
    }
};

//https://leetcode.com/problems/evaluate-reverse-polish-notation
//Super horrible but don't have time right now to split into
//seperate functions