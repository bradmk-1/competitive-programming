class Solution {
    public int numberOfSubstrings(String s) {
        int l = 0, r = 0;
        int res = 0;
        int aCnt = 0, bCnt = 0, cCnt = 0;

        while (r < s.length()) {
            switch(s.charAt(r)) {
               case 'a' -> aCnt++;
               case 'b' -> bCnt++;
               case 'c' -> cCnt++;
            }

            while(aCnt >= 1 && bCnt >= 1 && cCnt >= 1) {
                switch(s.charAt(l)) {
                    case 'a' -> aCnt--;
                    case 'b' -> bCnt--;
                    case 'c' -> cCnt--;
                }
                l++;
            }

            res += l;
            r++;
        }

        return res;
    }
}

// https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/
