class Solution {
    int fun(int arr[],int idx,int dp[]){
        if(idx>=arr.length) return 0;
        if(dp[idx]!=-1) return dp[idx];
        int f=arr[idx]+fun(arr,idx+2,dp);
        int s=fun(arr,idx+1,dp);
        dp[idx]=Math.max(f,s);
        return dp[idx];
    }
    public int rob(int[] nums) {
        int dp[]=new int[nums.length+1];
        Arrays.fill(dp,-1);
        return fun(nums,0,dp);
    }
}