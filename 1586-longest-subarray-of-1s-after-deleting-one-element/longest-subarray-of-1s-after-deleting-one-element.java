class Solution {
    public int longestSubarray(int[] nums) {
        int l=0;
        int r=0;
        int t=1;
        int c=0;
        int ans=0;
        while(r<nums.length){
            if(nums[r]==0 && t>0){
                t--;
                ans=Math.max(r-l+1,ans);

                r++;
            }
            else if(nums[r]==0 && t==0){
                if(nums[l]==0){
                    l++;
                    t++;
                }
                else{
                    l++;
                }
            }
            else{
                ans=Math.max(r-l+1,ans);
                r++;
            }
        }
        return ans-1;
    }
}