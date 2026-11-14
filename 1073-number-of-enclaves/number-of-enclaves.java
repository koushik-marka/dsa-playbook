class Solution {
    int ans=0;boolean b=false;
    int dfs(int[][] arr,int r,int c){
        if(r<0||c<0||r>=arr.length||c>=arr[0].length){
            b=true;
            return 0;
        }
        if(arr[r][c]==0){
            return 0;
        }
        arr[r][c]=0;
        
        return 1+dfs(arr,r-1,c)+dfs(arr,r,c-1)+dfs(arr,r+1,c)+dfs(arr,r,c+1);
    }
    public int numEnclaves(int[][] grid) {
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    b=false;
                    int a=dfs(grid,i,j);
                    if(!b){
                        ans+=a;
                    }
                }
                
            }
        }
        return ans;
    }
}