class Solution {
    public boolean areOccurrencesEqual(String s) {
        int fq[]=new int[26];
        for(char ch : s.toCharArray()){
            fq[ch-'a']++;
        }
        int a=fq[s.charAt(0)-'a'];
        for(int i=0;i<26;i++){
            if(fq[i]!=0 && fq[i]!=a){
                return false;
            }
        }
        return true;
    }
}