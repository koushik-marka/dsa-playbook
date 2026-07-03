class Solution {
    boolean inrow(String word,String row){
        for(char ch : word.toCharArray()){
            if(row.indexOf(Character.toLowerCase(ch))==-1){
                return false;
            }
        }
        return true;
    }
    public String[] findWords(String[] words) {
        List<String> ans=new ArrayList<>();
        String first="qwertyuiop";
        String second="asdfghjkl";
        String third="zxcvbnm";
        for(int i=0;i<words.length;i++){
            if(inrow(words[i],first) || inrow(words[i],second) || inrow(words[i],third)){
                ans.add(words[i]);
            }
        }
        return ans.toArray(new String[0]);
    }
}