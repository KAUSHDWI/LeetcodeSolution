class Solution {
    public int closedIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        
        // Step 1: Flood-fill and eliminate land touching the left and right boundaries
        for (int i = 0; i < m; i++) {
            if (grid[i][0] == 0) dfs(grid, i, 0, m, n);
            if (grid[i][n - 1] == 0) dfs(grid, i, n - 1, m, n);
        }
        
        // Step 1: Flood-fill and eliminate land touching the top and bottom boundaries
        for (int j = 0; j < n; j++) {
            if (grid[0][j] == 0) dfs(grid, 0, j, m, n);
            if (grid[m - 1][j] == 0) dfs(grid, m - 1, j, m, n);
        }
        
        int closedIslandsCount = 0;
        
        // Step 2: Look for remaining safely enclosed islands
        for (int i = 1; i < m - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                if (grid[i][j] == 0) {
                    dfs(grid, i, j, m, n);
                    closedIslandsCount++;
                }
            }
        }
        
        return closedIslandsCount;
    }
    
    private void dfs(int[][] grid, int r, int c, int m, int n) {
        // Base case: Out of bounds or already water/visited
        if (r < 0 || r >= m || c < 0 || c >= n || grid[r][c] == 1) {
            return;
        }
        
        // In-place modification to avoid needing a separate 'visited' tracking set
        grid[r][c] = 1; 
        
        // 4-Directional traversal
        dfs(grid, r + 1, c, m, n);
        dfs(grid, r - 1, c, m, n);
        dfs(grid, r, c + 1, m, n);
        dfs(grid, r, c - 1, m, n);
    }
}