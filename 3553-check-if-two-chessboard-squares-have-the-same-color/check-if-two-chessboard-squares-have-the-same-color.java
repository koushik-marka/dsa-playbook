class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        char c1=coordinate1.charAt(0);
        char c2=coordinate2.charAt(0);
        int d1 =coordinate1.charAt(1)-'0';
        int d2 =coordinate2.charAt(1)-'0';
        int d=1;
        int e=1;
        if(c1=='a' || c1=='c' || c1=='e' || c1=='g'){
            if(d1%2!=0) d=1;
            else d=0;
        }
        else{
            if(d1%2!=0) d=0;
            else d=1;
        }
        if(c2=='b' || c2=='d' || c2=='f' || c2=='h'){
            if(d2%2!=0) e=0;
            else e=1;
        }
        else{
            if(d2%2!=0) e=1;
            else e=0;
        }
        return e==d;
        
    }
}