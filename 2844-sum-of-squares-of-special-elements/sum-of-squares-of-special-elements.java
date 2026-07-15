class Solution {
    public int sumOfSquares(int[] nums) {
        int a=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(n%(i+1)==0){
                a+=nums[i]*nums[i];
            }
        }
        return a;
    }
}