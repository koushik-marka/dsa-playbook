class Solution {
    public char findTheDifference(String s, String t) {
        int ch=0;
        int i=0;
        int j=0;
        while(j<t.length()){
            ch=ch+t.charAt(j);
            j++;
        }
        while(i<s.length()){
            ch=ch-s.charAt(i);
            i++;
        }
        return (char)ch;
    }
}