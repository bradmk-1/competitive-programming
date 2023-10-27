class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        vector<int> prefix{};
        vector<int> suffix{};

        int exponent{ 1 };

        for (int i = 0; i < nums.size(); i++) {
            prefix.push_back(exponent);
            exponent *= nums[i];
        }

        exponent = 1;
        reverse(nums.begin(), nums.end());

        for (int i = 0; i < nums.size(); i++) {
            suffix.push_back(exponent);
            exponent *= nums[i];
        }

        reverse(suffix.begin(), suffix.end());

        for (int i = 0; i < prefix.size(); i++) {
            prefix[i] *= suffix[i];
        }

        return prefix;
    }
};

//https://leetcode.com/problems/product-of-array-except-self