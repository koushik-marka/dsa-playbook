class Solution {
    public long countCommas(long n) {
        if(n<1000) return 0;
        long av=0;
        if (n>=1000) {
            av=av+n-1000+1;
        }
        if(n>=1000000){
            av=av+n-1000000+1;
        }
        if(n>=1000000000L){
            av=av+n-1000000000L+1;
        }
        if(n>=1000000000000L){
            av=av+n-1000000000000L+1;
        }
        if(n>=1000000000000000L){
            av=av+n-1000000000000000L+1;
        }
        return av;
    }
}