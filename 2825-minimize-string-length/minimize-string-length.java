class Solution {
    public int minimizedStringLength(String s) {
        int fq[]=new int[26];
        int ans=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            fq[ch-'a']++;
            if(fq[ch-'a']==1){
                ans++;
            }
        }
        return ans;
    }
}