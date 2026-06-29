class Solution {
    public boolean areOccurrencesEqual(String s) {
        int fq[]=new int[26];
        for(char ch : s.toCharArray()){
            fq[ch-'a']++;
        }
        int a=fq[s.charAt(0)-'a'];
        for(int i=0;i<s.length();i++){
            if(fq[s.charAt(i)-'a']!=a){
                return false;
            }
        }
        return true;
    }
}