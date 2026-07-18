class Solution {
    public int findGCD(int[] nums) {
        int g=nums[0];
        int s=nums[0];
        for(int i=0;i<nums.length;i++){
            if(g<nums[i]){
                g=nums[i];
            }
            if(s>nums[i]){
                s=nums[i];
            }
        }
        while(s!=0){
            int t=s;
            s=g%s;
            g=t;
        }
        return g;
    }
}