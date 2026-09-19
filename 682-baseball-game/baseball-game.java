class Solution {
    public int calPoints(String[] op) {
        Stack<Integer> st=new Stack<>();
    for(int i=0;i<op.length;i++){
        String ch=op[i];
        if(ch.equals("C")){
            st.pop();
        }
        else if(ch.equals("D")){
            st.push(st.peek()*2);
        }
        else if(ch.equals("+")){
            int t=st.pop();
            int t2=st.peek();
            st.push(t);
            st.push(t2+t);
        }
        else{
            st.push(Integer.parseInt(ch));
        }
    }
    int av=0;
    while(!st.isEmpty()){
        av+=st.pop();
    }
    return av;
    }
}