class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        map<int, int> numTracker;
        vector<int> res;

        for (int i = 0; i < nums.size(); i++) {
            int ntf = target - nums[i];

            if (numTracker.contains(ntf)) {
                res.push_back(i);
                res.push_back(numTracker.at(ntf));
                return res;
            }
            else {
                numTracker.insert({ nums[i], i });
            }
        }
        return {};
    }
};

//https://leetcode.com/problems/two-sum