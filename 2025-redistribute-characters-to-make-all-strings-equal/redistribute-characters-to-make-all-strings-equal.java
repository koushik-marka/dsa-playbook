class Solution {
    public boolean makeEqual(String[] words) {
        int[] fq=new int[26];
        for(int i=0;i<words.length;i++){
            int l=0;
            while(l<words[i].length()){
                fq[words[i].charAt(l)-'a']++;
                l++;
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