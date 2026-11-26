class Solution {
    public boolean canAliceWin(int n) {
        int s=10;
        boolean f=true;
        while(n>0){
            if(n<s) break;
            n-=s;
            s-=1;
            f=!f;
        }
        return !f;
    }
}