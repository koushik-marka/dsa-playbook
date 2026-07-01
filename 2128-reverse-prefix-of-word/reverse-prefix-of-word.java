class Solution {
    public String reversePrefix(String word, char ch) {
        int i=0;
        int j=word.indexOf(ch);
        char avj[]=word.toCharArray();
        while(i<j){
            char t = avj[i];
            avj[i] = avj[j];
            avj[j] = t;
            i++;
            j--;
        }
        return String.valueOf(avj);
    }
}