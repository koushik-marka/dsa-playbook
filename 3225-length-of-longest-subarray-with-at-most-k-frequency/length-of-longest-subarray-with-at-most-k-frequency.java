class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        int av=0;
        int l=0;
        for(int r=0;r<nums.length;r++){
            mp.put(nums[r],mp.getOrDefault(nums[r],0)+1);

            while(mp.get(nums[r])>k){
                mp.put(nums[l],mp.getOrDefault(nums[l],0)-1);
                l++;
            }
            av=Math.max(av,r-l+1);
        }
            
        return av;
    }
}