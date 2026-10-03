class Solution {
    public int[] finalPrices(int[] prices) {
        int a[]=new int[prices.length];
        Stack<Integer> st=new Stack<>();
        for(int i=prices.length-1;i>=0;i--){
            while(!st.empty() && st.peek()>prices[i]){
                st.pop();
            }
            if(!st.empty()&& st.peek()<=prices[i]){
                a[i]=prices[i]-st.peek();
            }
            else{
                a[i]=prices[i];
            }
            st.push(prices[i]);
        }
        return a;
    }
}