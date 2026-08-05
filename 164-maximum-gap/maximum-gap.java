class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int av=0;
        for(int i=1;i<nums.length;i++){
            av=Math.max(nums[i]-nums[i-1],av);
        }
        return av;
    }
}