class Solution {
    public long maxAlternatingSum(int[] nums) {
        long av=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                nums[i]=nums[i]*-1;
            }
        }
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        while(i<j){
            av+=nums[j]*nums[j] - nums[i]*nums[i];
            i++;
            j--;
        }
        if (i==j){
            av+=nums[i]*nums[i];
        }
        return av;
    }
}