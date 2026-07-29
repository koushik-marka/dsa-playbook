class Solution {
    public String addStrings(String num1, String num2) {
        int i=num1.length()-1;
        int j=num2.length()-1;
        int c=0;
        StringBuilder sb=new StringBuilder();
        while(i>=0 || j>=0|| c!=0){
            int s=c;
            if(i>=0){
                s+=num1.charAt(i)-'0';
                i--;
            }
            if(j>=0){
                s+=num2.charAt(j)-'0';
                j--;
            }
            sb.append(s%10);
            c=s/10;
        }
        return sb.reverse().toString();
    }
}