class Solution {
    public int countAsterisks(String s) {
        int a=0;
        int c=0;
        int cin=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='|'){
                a++;
            }
            else if(s.charAt(i)=='*' && a==0){
                c++;
            }
            else if(s.charAt(i)=='*' && a==1){
                cin++;
            }
            if(a==2){
                a=0;
                cin=0;
            }
        }
        return c+cin;
    }
}