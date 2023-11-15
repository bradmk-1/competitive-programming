class Solution {
public:
    bool isValid(string s) {
        const map<char, char>pairs{ {')', '('},  {'}', '{'}, {']', '['} };
        stack<char> tracker{};

        if (s.length() == 1) return false;

        for (auto subString : s) {
            if (subString == '(' || subString == '{' || subString == '[') {
                tracker.push(subString);
            }
            else if (!tracker.empty()) {
                if (pairs.at(subString) != tracker.top()) {
                    return false;
                }
                tracker.pop();
            }
            else {
                return false;
            }
        }

        if (!tracker.empty()) {
            return false;
        }
        else {
            return true;
        }
    }
};

//https://leetcode.com/problems/valid-parentheses