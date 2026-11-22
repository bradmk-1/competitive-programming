class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int res = 0;
        int l = 0; int r = 0;
        int curr = 0;

        while (r < s.length()) {
            curr += Math.abs(s.charAt(r) - t.charAt(r));
            
            while(curr > maxCost) {
                curr -= Math.abs(s.charAt(l) - t.charAt(l));
                l++;
            }

            res = Math.max(res, r - l + 1);
            r++;
        }

        return res;
    }
}

// https://leetcode.com/problems/get-equal-substrings-within-budget/
