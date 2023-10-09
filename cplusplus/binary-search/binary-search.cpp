class Solution {
public:
    int search(vector<int>& nums, int target) {
        int startPtr = 0;
        int endPtr = nums.size() - 1;
        int midPtr = 0;

        while (startPtr <= endPtr) {
            midPtr = (startPtr + endPtr) / 2;
            if (nums[midPtr] == target) {
                return midPtr;
            }
            else if (nums[midPtr] < target) {
                startPtr = midPtr + 1;
            }
            else if (nums[midPtr] > target) {
                endPtr = midPtr - 1;
            }
        };

        return -1;
    }
};