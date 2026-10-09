class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0;
        int[] av=new int[nums.length];
        int j=nums.length-1;
        for(int k=nums.length-1;k>=0;k--){
            if(Math.abs(nums[i])>Math.abs(nums[j])){
                av[k]=nums[i]*nums[i];
                i++;
            }
            else{
                av[k]=nums[j]*nums[j];
                j--;
            }
        }
        return av;
    }
}