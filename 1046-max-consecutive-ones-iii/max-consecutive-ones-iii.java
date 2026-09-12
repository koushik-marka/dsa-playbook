class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0;
        int r=0;
        int t=k;
        int ans=0;
        while(r<nums.length){
            if(nums[r]==0 && t>0){
                t--;
                
                ans=Math.max(r-l+1,ans);
                r++;
            }
            else if(nums[r]==0 && t==0){
                l++;
                r=l;
                t=k;
            }
            else{
                ans=Math.max(r-l+1,ans);
                r++;
            }
        }
        return ans;
    }
}