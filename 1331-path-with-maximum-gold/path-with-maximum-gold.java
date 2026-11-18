class Solution {
    int ms=0;
    void dfs(int[][] arr,int i,int j,int s){
        if(i<0 || j<0 || i>=arr.length || j>=arr[i].length|| arr[i][j]==0){
            ms=Math.max(s,ms);
            return;
        }
        s+=arr[i][j];
        int t=arr[i][j];
        arr[i][j]=0;
        dfs(arr,i+1,j,s);
        dfs(arr,i,j-1,s);
        dfs(arr,i-1,j,s);
        dfs(arr,i,j+1,s);
        arr[i][j]=t;
    }
    public int getMaximumGold(int[][] grid) {
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]!=0){
                    dfs(grid,i,j,0);
                }
                
            }
        }
        return ms;
    }
}