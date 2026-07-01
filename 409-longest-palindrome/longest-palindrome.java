class Solution {
    public int longestPalindrome(String s) {
        int arr[]=new int[58];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'A']++;
        }
        int avj=0;
        for(int i=0;i<58;i++){
            avj+=(arr[i]/2)*2;

        }
        return avj<s.length() ? avj+1 : avj;
    }
}