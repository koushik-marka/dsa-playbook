class Solution {
    public int minMoves(int[] nums) {
        int m=Integer.MIN_VALUE;
        for(int x : nums){
            m=Math.max(x,m);
        }
        int ans=0;
        for(int p:nums){
            ans+=m-p;
        }
        return ans;
    }
}