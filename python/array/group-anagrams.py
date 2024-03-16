class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        groups = {}

        if not len(strs):
            return [strs[0]]

        for i in strs:
            sorted_str = ''.join(sorted(i))
            if sorted_str in groups:
                groups[sorted_str].append(i)
            else:
                groups[sorted_str] = [i]

        return groups.values()