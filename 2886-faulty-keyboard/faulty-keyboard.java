class Solution {
    public String finalString(String s) {
        StringBuilder av=new StringBuilder();
        char arr[]=s.toCharArray();
        for(char ch:arr){
            if(ch=='i'){
                av.reverse();
            }
            else{
                av.append(ch);
            }
        }
        return av.toString();
    }
}