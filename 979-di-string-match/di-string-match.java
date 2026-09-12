class Solution {
    public int[] diStringMatch(String s) {
        int i=0;
        int j=s.length();
        int l=s.length();
        int a[]=new int[s.length()+1];
        int p=0;
        for(int k=0;k<l;k++){
            if(s.charAt(k)=='I'){
                a[p]=i;
                i++;
                p++;
            }
            else{
                a[p]=j;
                j--;
                p++;
            }
        }
        a[p++]=i++;
        return a;
    }
}