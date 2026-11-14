class Solution {
    int ans=0;
    int dfs(int[][] grid,int r,int c){
        if(r<0||c<0||r>=grid.length||c>=grid[0].length||grid[r][c]==0){
            return 0;
        }
        grid[r][c]=0;
        return dfs(grid,r-1,c)+dfs(grid,r,c-1)+dfs(grid,r+1,c)+dfs(grid,r,c+1)+1;
    }
    public int maxAreaOfIsland(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==1){
                    ans=Math.max(ans,dfs(grid,i,j));
                }
            }
        }
        return ans;
    }
}