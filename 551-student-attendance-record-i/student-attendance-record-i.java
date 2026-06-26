class Solution {
    public boolean checkRecord(String s) {
        if(s.contains("LLL")) return false;
        int a=s.indexOf('A');
        if(a!=s.length()-1){
            if(s.substring(a+1).indexOf('A')!=-1) return false;
        }
        
        

        return true;
    }
}