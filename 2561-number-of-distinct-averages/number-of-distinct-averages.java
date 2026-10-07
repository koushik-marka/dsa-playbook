class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        Set<Integer> hs=new HashSet<>();
        int j=nums.length-1;
        while(i<j){
            int sum=nums[i]+nums[j];
            hs.add(sum);
            i++;
            j--;
        }
        return hs.size();
    }
}