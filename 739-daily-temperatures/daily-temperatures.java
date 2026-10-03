class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        Stack<Integer> st=new Stack<>();
        int a[]=new int[n];
        int c=0;
        for(int i=n-1;i>=0;i--){
            
            while(!st.empty() && temperatures[st.peek()]<=temperatures[i]){
                st.pop();
            }
            if(!st.empty() && temperatures[st.peek()]>temperatures[i]){
                a[i]=st.peek()-i;
            }
            else{
                a[i]=0;
            }
            st.push(i);
        }
        return a;
    }
}