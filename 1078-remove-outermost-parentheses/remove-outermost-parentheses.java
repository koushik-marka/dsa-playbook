class Solution {
    public String removeOuterParentheses(String s) {
        int o=0;
        int c=0;
        int i=0;
        String a="";
        for(int j=0;j<s.length();j++){
            char ch=s.charAt(j);
            if(ch=='('){
                o++;
            }
            else{
                c++;
            }
            if(o==c){
                a=a+s.substring(i+1,j);
                c=0;
                o=0;
                i=j+1;
            }
        }
        return a;
    }
}