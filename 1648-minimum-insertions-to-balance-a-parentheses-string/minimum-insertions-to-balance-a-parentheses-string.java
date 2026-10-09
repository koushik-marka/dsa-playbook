class Solution {
    public int minInsertions(String s) {
        int o=0;
        int in=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                o++;
            }
            else{
                if(i+1<s.length() && s.charAt(i+1)==')'){
                    i++;
                }
                else{
                    in++;
                }
                if(o>0) o--;
                else in++;
            }
        }
        return in+ o*2;
    }
}