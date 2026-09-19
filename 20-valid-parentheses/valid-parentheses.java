class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        char arr[]=s.toCharArray();
        if(arr.length%2!=0) return false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==')' && !st.isEmpty() && st.peek()=='('){
                st.pop();
            }
            else if(arr[i]=='}' && !st.isEmpty() && st.peek()=='{'){
                st.pop();
            }
            else if(arr[i]==']' && !st.isEmpty() &&st.peek()=='['){
                st.pop();
            }
            else{
                st.push(arr[i]);
            }
        }
        return st.isEmpty();
    }
}