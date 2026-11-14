class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        boolean[][] visited = new boolean[rows][cols];
        int maxArea = 0;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {

                if (grid[r][c] == 1 && !visited[r][c]) {
                    int currentArea = dfs(grid, visited, r, c);
                    maxArea = Math.max(maxArea, currentArea);
                }
                
            }
        }
        return maxArea;
    }

    private int dfs(int[][] grid, boolean[][] visited, int r, int c) {
        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || grid[r][c] == 0 || visited[r][c]) {
            return 0;
        }
        visited[r][c] = true;
        return 1 + dfs(grid, visited, r + 1, c)+ dfs(grid, visited, r - 1, c)+ dfs(grid, visited, r, c + 1)+ dfs(grid, visited, r, c - 1);
    }
}
