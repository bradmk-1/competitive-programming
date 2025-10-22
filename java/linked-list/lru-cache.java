class LRUCache {

    private LinkedHashMap<Integer, Integer> cache;
    private int cacheCapacity;

    public LRUCache(int capacity) {
        cacheCapacity = capacity;
        cache = new LinkedHashMap<Integer, Integer>(capacity, .75f, true) {
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                return size() > cacheCapacity;
            };
        };
    };

    public int get(int key) {
        return cache.getOrDefault(key, -1);
    };

    public void put(int key, int value) {
        cache.put(key, value);
    };
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */


 // https://leetcode.com/problems/lru-cache/
