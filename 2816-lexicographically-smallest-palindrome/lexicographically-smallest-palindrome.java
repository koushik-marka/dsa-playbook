class Solution {
    public String makeSmallestPalindrome(String s) {
        char[] av=s.toCharArray();
        int i=0,j=av.length-1;
        while(i<j){
            if(av[i]!=av[j]){
                char ch=(char) Math.min(av[i],av[j]);
                av[i]=ch;
                av[j]=ch;
            }
            i++;
            j--;
        }
        return new String(av);
    }
}