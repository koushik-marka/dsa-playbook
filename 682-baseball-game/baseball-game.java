class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack();
        int av=0;
        for(String op:operations){
            if(op.equals("+")){
                int t=st.pop();
                int nt=t+st.peek();
                st.push(t);
                st.push(nt);
            }
            else if(op.equals("C")){
                av-=st.pop();
                continue;
            }
            else if(op.equals("D")){
                st.push(2*st.peek());
            }
            else{
                st.push(Integer.valueOf(op));
            }
            av+=st.peek();
        }
        return av;
    }
}