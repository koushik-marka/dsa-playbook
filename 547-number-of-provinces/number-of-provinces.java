class Solution {
    void fun(int[][] arr,boolean vis[],int s){
        if(vis[s]) return;
        vis[s]=true;
        for(int i=0;i<arr.length;i++){
            if(arr[s][i]==1 && !vis[i]){
                fun(arr,vis,i);
            }
        }
    }
    public int findCircleNum(int[][] arr) {
        int n=arr.length;
        boolean vis[]=new boolean[n];
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(!vis[i]){
                c++;
                fun(arr,vis,i);
            }
        }
        return c;
    }
}