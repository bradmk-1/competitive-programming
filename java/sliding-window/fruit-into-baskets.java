class Solution {
    public int totalFruit(int[] fruits) {
        int res = 0;
        Map<Integer, Integer> collected = new HashMap<>();
        int l = 0, r = 0;

        while (r < fruits.length) {
            collected.put(fruits[r], collected.getOrDefault(fruits[r], 0) + 1);

            while (collected.size() > 2 && l <= r) {
                collected.computeIfPresent(fruits[l], (k, v) -> v == 1 ? null :  v - 1);
                l++;                
            }
            
            res = Math.max(res, r - l + 1);
            r++;
        }

        return res;
    }
}

// https://leetcode.com/problems/fruit-into-baskets/
