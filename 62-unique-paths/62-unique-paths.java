class Solution {
   public int uniquePaths(int m, int n) {
        return dfs(new HashMap<Pair, Integer>(), 0, 0, m, n);
    }

    private static int dfs(Map<Pair, Integer> cache, int r, int c, int rows, int cols) {
        Pair p = new Pair(r, c);

        if (cache.containsKey(p)) {
            return cache.get(p);
        }

        if (r == rows - 1 || c == cols - 1) {
            return 1;
        }
        
        cache.put(p, dfs(cache, r + 1, c, rows, cols) + dfs(cache, r, c + 1, rows, cols));
        return cache.get(p);
    }
}