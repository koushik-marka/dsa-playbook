class Solution {
    public int numberOfSubstrings(String s) {
        int l=0;
        int a=0;
        int fq[]=new int[3];
        for(int r=0;r<s.length();r++){
            fq[s.charAt(r)-'a']++;
            while(fq[0]>0 && fq[1]>0 && fq[2]>0){
                a=a+(s.length()-r);
                fq[s.charAt(l)-'a']--;
                l++;
            }
        }
        return a;
    }
}