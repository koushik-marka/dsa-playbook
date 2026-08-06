class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
            int h=n;
            int prod=1;
            while(h>0){
                int r=h%10;
                prod=prod*r;
                h/=10;
            }
            if(prod%t==0) return n;
            n++;
        }
        
    }
}