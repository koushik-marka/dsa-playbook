class Solution {
    public boolean makeEqual(String[] words) {
        int[] fq=new int[26];
        for(String s : words){
            for(char ch : s.toCharArray()){
                fq[ch-'a']++;
            }
        }
        int n=words.length;
        for(int i=0;i<26;i++){
            if(fq[i]%n!=0){
                return false;
            }
        }
        return true;
    }
}