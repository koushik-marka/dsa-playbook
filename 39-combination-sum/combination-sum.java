class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    void fun(int arr[],int t,ArrayList<Integer> al,int idx){
        if(idx>=arr.length){
            return;
        }
        if(t==0){
            ans.add(new ArrayList<>(al));
            return;
        }
        if(t<0){
            return;
        }
        al.add(arr[idx]);
        fun(arr,t-arr[idx],al,idx);
        al.remove(al.size()-1);
        fun(arr,t,al,idx+1);
        
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        fun(candidates,target,new ArrayList<>(),0);
        return ans;
    }
}