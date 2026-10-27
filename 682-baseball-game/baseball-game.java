class Solution {
    public int calPoints(String[] op) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<op.length;i++){
            if(op[i].equals("+")){
                int p=st.pop();
                int s=st.peek();
                st.push(p);
                st.push(p+s);
            }
            else if(op[i].equals("C")){
                st.pop();
            }
            else if(op[i].equals("D")){
                st.push(st.peek()*2);
            }
            else{
                st.push(Integer.parseInt(op[i]));
            }
        }
        int ans=0;
        while(!st.isEmpty()){
            ans+=st.pop();
        }
        return ans;
    }
}