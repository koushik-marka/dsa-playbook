class Solution {
    public int[] resultArray(int[] nums) {
        int[] t=new int[nums.length];
        List<Integer> av =new ArrayList<>();
        List<Integer> arr2 =new ArrayList<>();
        av.add(nums[0]);
        arr2.add(nums[1]);
        for(int i=2;i<nums.length;i++){
            if(av.get(av.size()-1)>arr2.get(arr2.size()-1)){
                av.add(nums[i]);
            }
            else{
                arr2.add(nums[i]);
            }
        }
        av.addAll(arr2);
        return av.stream().mapToInt(Integer::intValue).toArray();
    }
}