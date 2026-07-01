class Solution {
    public String convertToBase7(int num) {
        StringBuilder a=new StringBuilder();
        if(num==0) return "0";
        boolean t=false;
        if(num<0) {
            num=num*-1;
            t=true;
        }
        
        while(num>0){
            a.append(num%7);
            num/=7;
        }
        if(t){
            a.append("-");
        }
        return a.reverse().toString();
    }
}