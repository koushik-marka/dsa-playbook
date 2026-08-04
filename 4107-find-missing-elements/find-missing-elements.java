class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int l=nums[0];
        int r=nums[0];

        for(int i=0;i<nums.length;i++){
            if(nums[i]<l){
                l=nums[i];
            }
            else if(nums[i]>r){
                r=nums[i];
            }
        }
        int dp[]=new int[r-l+1];
        for(int i=0;i<nums.length;i++){
            dp[nums[i]-l]++;
        }
        List<Integer> av=new ArrayList<>();
        for(int i=0;i<dp.length;i++){
            if(dp[i]==0){
                av.add(i+l);
            }
        }
        return av;
    }
}