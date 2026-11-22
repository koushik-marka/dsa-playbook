class Solution {
    public boolean checkString(String s) {
        int c=0;
        char ch=s.charAt(0);
        for(int i=1;i<s.length();i++){
            if(ch!=s.charAt(i)){
                c++;
                ch=s.charAt(i);
            }
        }
        if(c==0) return true;
        if(c==1 && ch=='b') return true;
        return false;
    }
}