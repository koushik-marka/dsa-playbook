class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int a[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            Stack<Integer> st=new Stack<>();
            for(int j=nums2.length-1;j>=0;j--){
                while(!st.empty() && st.peek()<=nums2[j]){
                    st.pop();
                }
                if(nums2[j]==nums1[i] && !st.empty()&& st.peek()>nums2[j]){
                    a[i]=st.peek();
                    break;
                }
                else if(nums2[j]==nums1[i]){
                    a[i]=-1;
                    break;
                }
                st.push(nums2[j]);
            }
        }
        return a;
    }
}