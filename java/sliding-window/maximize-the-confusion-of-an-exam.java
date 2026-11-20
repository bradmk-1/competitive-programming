class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int l = 0; int r = 0;
        int fs = 0, ts = 0;
        int res = 0;

        while (r < answerKey.length()) {
            if (answerKey.charAt(r) == 'T') {
                ts++;
            } else {
                fs++;
            }

            while (Math.min(fs, ts) > k) {
                if (answerKey.charAt(l) == 'T') {
                    ts--;
                } else {
                    fs--;
                }
                l++;
            }

            res = Math.max(res, r - l + 1);
            r++;
        } 

        return res; 
    }
}

// https://leetcode.com/problems/maximize-the-confusion-of-an-exam/
