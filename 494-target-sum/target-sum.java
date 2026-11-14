class Solution {
    int ans=0;
    void func(int arr[],int t,int idx,int cs){
        if(cs==t && idx==arr.length){
            ans++;
            return;
        }
        if(idx==arr.length){
            return;
        }
        func(arr,t,idx+1,cs+arr[idx]);
        func(arr,t,idx+1,cs-arr[idx]);
    }
    public int findTargetSumWays(int[] nums, int target) {
        func(nums,target,0,0);
        return ans;
    }
}