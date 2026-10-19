class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        int s=0;
        int e=nums.length;
        List<Integer> ls=new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                s=i;
                break;
            }
        }
        for(int i=s;i<nums.length;i++){
            if(nums[i]!=target){
                e=i;
                break;
            }
        }
        for(int i=s;i<e;i++){
            ls.add(i);
        }
        return ls;
    }
}