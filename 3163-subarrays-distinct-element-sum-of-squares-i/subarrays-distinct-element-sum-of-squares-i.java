class Solution {
    public int sumCounts(List<Integer> nums) {
        
        int s=0;
        for(int i=0;i<nums.size();i++){
            HashSet<Integer> hs=new HashSet<>();
            for(int j=i;j<nums.size();j++){
                hs.add(nums.get(j));
                s+=hs.size()*hs.size();
            }
        }
        return s;
    }
}