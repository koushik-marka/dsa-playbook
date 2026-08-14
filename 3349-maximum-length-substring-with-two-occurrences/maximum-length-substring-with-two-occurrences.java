class Solution {
    public int maximumLengthSubstring(String s) {
        int av=0;
        int l=0;
        int fq[]=new int[26];
        for(int r=0;r<s.length();r++){
            char ch=s.charAt(r);
            fq[ch-'a']++;
            while(fq[ch-'a']>2){
                fq[s.charAt(l)-'a']--;
                l++;
            }
            av=Math.max(av,r-l+1);
        }
        return av;
    }
}