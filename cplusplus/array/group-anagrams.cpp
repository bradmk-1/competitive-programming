class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        unordered_map<string, vector<string>> res{};

        for (auto str : strs) {
            string originalStr = str;
            sort(str.begin(), str.end());

            if (res.contains(str)) {
                res[str].push_back(originalStr);
            }
            else {
                res.insert({ str, vector<string>{originalStr} });
            }
        }
        vector<vector<string>> mappedRes{};

        for (const auto& s : res) {
            mappedRes.push_back(s.second); class Solution {
            public:
                vector<vector<string>> groupAnagrams(vector<string>& strs) {
                    unordered_map<string, vector<string>> res{};

                    for (auto str : strs) {
                        string originalStr = str;
                        sort(str.begin(), str.end());

                        if (res.contains(str)) {
                            res[str].push_back(originalStr);
                        }
                        else {
                            res.insert({ str, vector<string>{originalStr} });
                        }
                    }
                    vector<vector<string>> mappedRes{};

                    for (const auto& s : res) {
                        mappedRes.push_back(s.second);
                    }
                    return mappedRes;
                }
            };
        }
        return mappedRes;
    }
};

//https://leetcode.com/problems/group-anagrams