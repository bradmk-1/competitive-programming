class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
        set<int> seenNums;

        for (int i : nums) {
            if (seenNums.contains(i)) {
                return true;
            } else {
                seenNums.insert(i);
            }
        };

        return false;
    }
};