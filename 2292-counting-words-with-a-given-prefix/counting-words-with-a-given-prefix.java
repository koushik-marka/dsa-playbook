class Solution {
    public int prefixCount(String[] words, String pref) {
        int c=0;
        int l=pref.length();
        System.out.println(l);
        for(int i=0;i<words.length;i++){
            if(words[i].length()<l) continue;
            if((words[i].substring(0,l)).equals(pref)) c++;
        }
        return c;
    }
}