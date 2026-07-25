class Solution {
    public int countNumbersWithUniqueDigits(int n) {
         if (n==0) return 1;
        int r=10;
        int a=9;
        int b=9;
        while(n>1){
            a=a*b;
            r+=a;
            b--;
            n--;
        }
        return r;
    }
}