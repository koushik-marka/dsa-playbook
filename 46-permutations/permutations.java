class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    void swap(int[] arr,int i,int j){
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
    void fun(int nums[],int idx,List<Integer> per){
        if(idx==nums.length){
            for(int i=0;i<nums.length;i++){
                per.add(nums[i]);
            }
            ans.add(new ArrayList<>(per));
            return;
        }
        for(int i=idx;i<nums.length;i++){
            int[] temp=nums.clone();
            swap(temp,idx,i);
            fun(temp,idx+1,new ArrayList<>());
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> per =new ArrayList<>();
        fun(nums,0,per);
        return ans;
    }
}