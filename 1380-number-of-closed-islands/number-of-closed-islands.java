class Solution {
    boolean f=true;
    void dfs(int[][] arr,int r,int c){
        if(r<0||c<0||r>=arr.length||c>=arr[0].length){
            f=false;
            return;
        }
        if(arr[r][c]==1){
            return;
        }
        arr[r][c]=1;
        dfs(arr,r+1,c);
        dfs(arr,r,c-1);
        dfs(arr,r-1,c);
        dfs(arr,r,c+1);
    }
    public int closedIsland(int[][] grid) {
        int c=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                f=true;
                if(grid[i][j]==0){
                    dfs(grid,i,j);
                    if(f) c++;
                }
                
            }
        }
        return c;
    }
}