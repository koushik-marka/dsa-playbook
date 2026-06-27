class Solution {
    public int fib(int n) {
        int f=0;
        int s=1;
        if(n<=1) return n;
        int ans=0;
        for(int i=2;i<=n;i++){
            ans=f+s;
            f=s;
            s=ans;
        }
        return ans;
    }
}