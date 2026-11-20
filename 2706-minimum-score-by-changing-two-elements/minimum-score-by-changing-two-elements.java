class Solution {
    public int minimizeSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length-1;
        return Math.min(nums[n]-nums[2],Math.min(nums[n-1]-nums[1],nums[n-2]-nums[0]));
    }
}