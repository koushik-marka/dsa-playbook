class Solution {
    public int missingInteger(int[] nums) {
        boolean[] s=new boolean[101];
        int av=nums[0];
        for(int i=0;i<nums.length;i++){
            s[nums[i]]=true;
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1){
                av+=nums[i];
            }
            else break;
        }
        for(int i=av;i<=52;i++){
            if(!s[i]) return i;
        }
        return av;
    }
}