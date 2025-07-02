class TimeMap:

    timestore = {}

    def __init__(self):
        self.timestore = {}
        

    def set(self, key: str, value: str, timestamp: int) -> None:
        if key in self.timestore:
            self.timestore[key].append((value, timestamp))
        else:
            self.timestore[key] = [(value, timestamp)]


        

    def get(self, key: str, timestamp: int) -> str:
        if key not in self.timestore:
            return ""

        l, r = 0, len(self.timestore[key]) - 1

        while l <= r:
            mid = (l + r) // 2

            if self.timestore[key][mid][1] <= timestamp:
                l = mid + 1
            else:
                r = mid - 1

        return self.timestore[key][r][0] if self.timestore[key][r][1] <= timestamp else ""


# https://leetcode.com/problems/time-based-key-value-store/
