class Solution {
    public boolean isCircularSentence(String s) {
        String t=s;
        int c=0;
        while(s.indexOf(" ")!=-1){
            c++;
            int a=s.indexOf(" ");
            if(s.charAt(a-1)==s.charAt(a+1)) s=s.substring(a+1);
            else return false;
        }

        if(c==0 && s.charAt(0)!=s.charAt(s.length()-1)) return false;
        if(t.charAt(0)!=t.charAt(t.length()-1)) return false;
        return true;
    }
}