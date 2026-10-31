class Solution {
    int fun(int arr[],int idx,int dp[]){
        if(idx>=arr.length) return 0;
        if(dp[idx]!=-1) return dp[idx];
        dp[idx]=arr[idx]+Math.min(fun(arr,idx+1,dp),fun(arr,idx+2,dp));
        return dp[idx];
    }
    public int minCostClimbingStairs(int[] cost) {
        int dp[]=new int[cost.length+1];
        Arrays.fill(dp,-1);
        return Math.min(fun(cost,0,dp),fun(cost,1,dp));
    }
}