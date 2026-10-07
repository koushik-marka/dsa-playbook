class Solution {
    public int minMaxGame(int[] nums) {
        int n=nums.length;
        int i=0;
        int j=1;
        int k=0;
        while(n!=1){
            while(j<n){
                nums[k]=Math.min(nums[i],nums[j]);
                k++;
                i+=2;
                j+=2;
                if(j<n){
                    nums[k]=Math.max(nums[i],nums[j]);
                    k++;
                    i+=2;
                    j+=2;
                    }
                
            }
            n/=2;
            i=0;
            j=1;
            k=0;
        }
        return nums[0];
    }
}