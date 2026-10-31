class Solution {
    int fun(int n,int m,int i,int j,int[][] dp){
        if(i>=n || j>=m){
            return 0;
        }
        else if(i==n-1 && j==m-1) return 1;
        if(dp[i][j]!=-1) return dp[i][j];
        int d=fun(n,m,i+1,j,dp);
        int r=fun(n,m,i,j+1,dp);
        dp[i][j]=d+r;
        return dp[i][j];
    }
    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m+1][n+1];
        for(int arr[] : dp){
            Arrays.fill(arr,-1);
        }
        return fun(m,n,0,0,dp);
    }
}