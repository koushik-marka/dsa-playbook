class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> fq=new HashMap<>();
        for(int i: nums){
            fq.put(i,fq.getOrDefault(i,0)+1);
            if(fq.get(i)>1){
                return true;
            }
        }
        return false;
    }
}