class Solution {
    public int countGoodSubstrings(String s) {
        int ans=0;
        for(int i=0;i<=s.length()-3;i++){
            char a=s.charAt(i);
            char v=s.charAt(i+1);
            char j=s.charAt(i+2);
            if(a!=v && v!=j && j!=a){
                ans++;
            }
        }
        return ans;
    }
}