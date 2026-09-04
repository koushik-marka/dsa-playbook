class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
        while(l<r){
            int s=(nums[l]+nums[r]);
            if(s==target){
                break;
            }
            else if(s>target){
                r--;
            }
            else{
                l++;
            }
        }
        return new int[] {l+1,r+1};
    }
}