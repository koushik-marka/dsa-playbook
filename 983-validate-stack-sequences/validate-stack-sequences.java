class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int i=0;
        int j=0;
        Stack<Integer> st=new Stack<>();
        while(j<popped.length ){
            if(!st.empty() && st.peek()==popped[j]){
                st.pop();
                j++;
                
            }
            else{
                st.push(pushed[i]);

                i++;
            }
            if(!st.empty()&& i==popped.length && st.peek()!=popped[j]){
                return false;
            }
        }
        return true;
    }
}