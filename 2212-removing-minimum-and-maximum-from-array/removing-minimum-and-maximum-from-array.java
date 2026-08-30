class Solution {
    public int minimumDeletions(int[] nums) {
        int l=0;
        int r=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[l]){
                l=i;
            }
            if(nums[i]>nums[r]){
                r=i;
            }
        }
        if(l>r){
            int temp=l;
            l=r;
            r=temp;
        }
        int b=(l+1)+(nums.length-r);
        int le=r+1;
        int ri=nums.length-l;
        return Math.min(b,Math.min(le,ri));
    }
}