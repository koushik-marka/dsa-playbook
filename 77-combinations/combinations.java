class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    void fun(int n,int k,int idx,List<Integer> sub){

        if(sub.size()==k){
            ans.add(new ArrayList<>(sub));
            return;
        }
        if(idx>n){
            return;
        }
        sub.add(idx);
        fun(n,k,idx+1,sub);
        sub.remove(sub.size()-1);
        fun(n,k,idx+1,sub);
    }
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> sub=new ArrayList<>();
        fun(n,k,1,sub);
        return ans;
    }
}