class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        priority_queue<pair<int, int>>pq{};
        map<int, int>numFreq{};
        vector<int> res;

        for (auto num : nums) {
            if (numFreq.contains(num)) {
                numFreq.insert({ num, numFreq[num]++ });
            }
            else {
                numFreq.insert({ num, 1 });
            }
        }

        for (auto [key, val] : numFreq) {
            pq.push({ val, key });
        }

        for (int i = 0; i < k; i++) {
            res.push_back(pq.top().second);
            pq.pop();
        }

        return res;
    }
};

// https://leetcode.com/problems/top-k-frequent-elements
// Trick is to use priority queue