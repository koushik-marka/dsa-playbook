class Solution {
    public String reverseVowels(String s) {
        int i=0;
        int j=s.length()-1;
        String o="aeiouAEIOU";
        char ch[]=s.toCharArray();
        while(i<=j){
            if((o.indexOf(ch[i]))==-1){
                i++;
                continue;
            } 
            if((o.indexOf(ch[j]))==-1) {
                j--;
                continue;
            }
            char t=ch[i];
            ch[i]=ch[j];
            ch[j]=t;
            i++;
            j--;
        }
        return String.valueOf(ch);
    }
}