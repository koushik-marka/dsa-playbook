class Solution {
    public int longestSubsequence(int[] nums) {
        int av=0,n=nums.length;
        boolean z=false;
        for(int x:nums){
            z |=x>0;
            av^=x;
        }
        if(!z) return 0;
        return av==0 ? n-1:n;
    }
}