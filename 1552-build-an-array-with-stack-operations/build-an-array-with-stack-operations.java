class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> st=new ArrayList<>();
        int l=target[target.length-1];
        int i=1;
        int c=0;
        while(i<=l){
            if(target[c]==i){
                st.add("Push");
                c++;
            }
            else{
                st.add("Push");
                st.add("Pop");
            }
            i++;
        }
        return st;
    }
}