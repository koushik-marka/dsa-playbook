class Solution {
    public String mergeAlternately(String word1, String word2) {
        int l1=word1.length();
        int l2=word2.length();
        char av[]=new char[l1+l2];
        int i=0;
        int j=0;
        int k=0;
        while(i<l1 &&j<l2){
            av[k]=word1.charAt(i);
            i++;
            k++;
            av[k]=word2.charAt(j);
            j++;
            k++;
        }
        while(i<l1){
            av[k]=word1.charAt(i);
            i++;
            k++;
        }
        while(j<l2){
            av[k]=word2.charAt(j);
            j++;
            k++;
        }
        return String.valueOf(av);
    }
}