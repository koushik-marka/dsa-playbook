class Solution {
    public String smallestPalindrome(String s) {
        int fq[]=new int[26];
        for(char ch:s.toCharArray()){
            fq[ch-'a']++;
        }
        StringBuilder sb=new StringBuilder();
        String mid="";
        for(int i=0;i<26;i++){
            while(fq[i]>=2){
                sb.append((char)('a'+i));
                fq[i]-=2;
            }
            if(fq[i]==1 && mid.isEmpty()){
                mid=String.valueOf((char)('a'+i));
            }
        }
        String r=new StringBuilder(sb).reverse().toString();
        return sb.toString()+mid+r;
    }
}