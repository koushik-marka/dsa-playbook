class Solution {
    void dfs(int arr[][],int r,int c,int col,int o){
        if(r<0||c<0||r>=arr.length||c>=arr[0].length||arr[r][c]==col || arr[r][c]!=o){
            return;
        }
        arr[r][c]=col;
        dfs(arr,r-1,c,col,o);
        dfs(arr,r,c-1,col,o);
        dfs(arr,r+1,c,col,o);
        dfs(arr,r,c+1,col,o);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int o=image[sr][sc];
        dfs(image,sr,sc,color,o);
        return image;
    }
}