class Solution {
    public String convert(String s, int numRows) {
        StringBuilder sb[]=new StringBuilder[numRows];
        for(int i=0;i<sb.length;i++){
            sb[i]=new StringBuilder();
        }
        if(s.length()<=numRows || numRows==1){
            return s;
        }
        boolean f=true;
        int c=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            sb[c].append(ch);
            if(f){
                c++;
            }
            else{
                c--;
            }
            if(c==0 || c==numRows-1){
                f=!f;
            }
        }
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<numRows;i++){
            ans.append(sb[i]);
        }
        return new String(ans);
    }
}