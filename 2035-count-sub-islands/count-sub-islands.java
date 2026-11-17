class Solution {
    boolean issame[]=new boolean[1];
    void dfs(int[][] arr, int[][] arr2,int r,int c,boolean[] issame){
        if(r<0||c<0||r>=arr.length||c>=arr[0].length|| arr2[r][c]==0){
            return;
        }
        if(arr2[r][c]!=arr[r][c]){
            issame[0]=false;
            return;
        }
        arr2[r][c]=0;
        dfs(arr,arr2,r-1,c,issame);
        dfs(arr,arr2,r+1,c,issame);
        dfs(arr,arr2,r,c-1,issame);
        dfs(arr,arr2,r,c+1,issame);
    }
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        
        int c=0;
        for(int i =0;i<grid2.length;i++){
            for(int j=0;j<grid2[0].length;j++){
                issame[0]=true;
                
                if(grid2[i][j]==1){
                    dfs(grid1,grid2,i,j,issame);
                    System.out.println(issame[0]);
                    if(issame[0]) c++;
                }
            }
        }
        return c;
    }
}