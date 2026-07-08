class Solution {
    public int myAtoi(String s) {
        int i=0;
        int j=s.length();
        while(i<s.length() &&s.charAt(i)==' '){
            i++;
        }
        int sg=1;
        if(i==s.length()) return 0;
        if(s.charAt(i)=='+' || s.charAt(i)=='-'){
            if(s.charAt(i)=='-'){
                sg=-1;
            }
            i++;
        }
        while(i<s.length() &&s.charAt(i)=='0'){
            i++;
        }
        int av=0;
        while(i<j){
            if(!Character.isDigit(s.charAt(i))){
                return av*sg;
            }
            if(av>Integer.MAX_VALUE/10 || (av==Integer.MAX_VALUE/10 && s.charAt(i)-'0'>7)){
                return sg==1 ? Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
            av=av*10+s.charAt(i)-'0';
            i++;
        }
        return av*sg;
    }
}