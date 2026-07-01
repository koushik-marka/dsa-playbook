class Solution {
    boolean ispal(String w){
        int i=0;
        int j=w.length()-1;
        while(i<j){
            if(w.charAt(i)!=w.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            if(ispal(words[i])){
                return words[i];
            }
        }
        return "";
    }
}