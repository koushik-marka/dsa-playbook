class Solution {
    int fun(int[] arr,int idx,int l,int dp[]){
        if(idx>=l){
            return 0;
        }
        if(dp[idx]!=-1) return dp[idx];
        int f=arr[idx]+fun(arr,idx+2,l,dp);
        int s=fun(arr,idx+1,l,dp);
        dp[idx]= Math.max(f,s);
        return dp[idx];
    }
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        int dp[]=new int[nums.length+1];
        Arrays.fill(dp,-1);
        int a=fun(nums,0,nums.length-1,dp);
        Arrays.fill(dp,-1);
        return Math.max(a,fun(nums,1,nums.length,dp));
    }
}