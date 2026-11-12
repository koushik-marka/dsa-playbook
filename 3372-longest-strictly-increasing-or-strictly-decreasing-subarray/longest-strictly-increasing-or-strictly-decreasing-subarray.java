class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        if(nums.length==1) return 1;
        int i=0;
        int j=1;
        int dec=0;
        int inc=0;
        while(j<nums.length){
            if(nums[j-1]<nums[j] || nums[j-1]==nums[j]){
                i=j;
            }
            dec=Math.max(dec,j-i+1);
            j++;
        }
        i=0;
        j=1;
        while(j<nums.length){
            if(nums[j-1]>nums[j] || nums[j-1]==nums[j]){
                i=j;
            }
            inc=Math.max(inc,j-i+1);
            j++;
        }
        return Math.max(dec,inc);
    }
}