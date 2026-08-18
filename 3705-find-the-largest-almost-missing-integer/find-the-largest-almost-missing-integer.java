class Solution {
    public int largestInteger(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
        }
        if(n==k){
            int maxValue = Integer.MIN_VALUE;

            for (int i = 0; i < n; i++) {
                maxValue = Math.max(maxValue, nums[i]);
            }

            return maxValue;
        }
        if(k==1){
            int m=-1;
            for(int i=0;i<n;i++){
                if(mp.get(nums[i])==1 && nums[i]>m){
                    m=nums[i];
                }
            }
            return m;
        }
        
        if(mp.get(nums[0])==1 && mp.get(nums[n-1])==1){
            return Math.max(nums[0],nums[n-1]);
        }
        else if(mp.get(nums[0])==1 && mp.get(nums[n-1])>1){
            return nums[0];
        }
        else if(mp.get(nums[0])>1 && mp.get(nums[n-1])==1){
            return nums[n-1];
        }
        return -1;
    }
}