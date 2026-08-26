class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int c=0;
        int l=0;
        int r=0;
        int ml=0;
        int mr=0;
        int cs=Integer.MAX_VALUE;
        while(r<s.length()){
            c+=s.charAt(r)-'0';
            while(c>=k){
                if(r-l<cs || r-l == cs && s.substring(l,r+1).compareTo(s.substring(ml,mr+1))<0){
                    ml=l;
                    mr=r;
                    cs=r-l;
                }
                c=c-(s.charAt(l)-'0');
                l++;
            }
            r++;
        }
        if(cs==Integer.MAX_VALUE){
            return "";
        }
        return s.substring(ml,mr+1);
    }
}