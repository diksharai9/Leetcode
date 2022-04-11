class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int total = m*n;
        // the following is done to make sure that you dont rotate more than total number of times.
        k = k % total;
        List<List<Integer>> list = new ArrayList<>();
        // create arraylist for each row.
        for(int i = 0; i < m; i++){
            list.add(new ArrayList<>());
        }
        for(int i = 0; i < total; i++) {
           
            int index = (total - k + i) % total;
            // i%n gives you the list bucket to which the element should be added.
            list.get(i/n).add(grid[index/n][index%n]);
            
        }
        return list;
        
    }
}