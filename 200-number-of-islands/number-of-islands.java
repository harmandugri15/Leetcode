class Solution {
    public static void dfs(char[][] grid,int row,int column){
        if(row<0 || column<0 || row>=grid.length || column>=grid[0].length|| grid[row][column]=='0'){
            return;
        }
        grid[row][column]='0';
        dfs(grid,row+1,column);
        dfs(grid,row-1,column);
        dfs(grid,row,column+1);
        dfs(grid,row,column-1);
    } 
    public int numIslands(char[][] grid) {
        if(grid==null || grid.length==0){
            return 0;
        }

        int n=grid.length;
        int c=grid[0].length;
        int islands=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]=='1'){
                    islands++;
                    dfs(grid,i,j);
                }
            }
        }
        return islands;
    }
}