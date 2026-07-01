class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int arr[]=new int[26];
        int m[]=new int[26];
        for(int i=0;i<ransomNote.length();i++){
            arr[ransomNote.charAt(i)-'a']++;
        }
        for(int i=0;i<magazine.length();i++){
            m[magazine.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(arr[i]>m[i]){
                return false;
            }
        }
        return true;
    }
}