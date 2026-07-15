class Solution {
    public int clumsy(int n) {
        int av=24;
        if(n<=4){
            if(n<=2) return n;
            else if(n==3) return 6;
            else if(n==4) return 7; 
        }
        else{
            if(n%4==2 || n%4==1) av=n+2;
            else if(n%4==3) av=n-1;
            else av=n+1;
        }
        return av;
    }
}