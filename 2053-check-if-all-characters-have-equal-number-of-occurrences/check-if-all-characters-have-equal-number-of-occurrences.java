class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character,Integer> fq=new HashMap<>();
        Integer first=null;
        for(int i=0;i<s.length();i++){
            fq.put(s.charAt(i),fq.getOrDefault(s.charAt(i),0)+1);
        }
        for(Integer val : fq.values()){
            if(first==null){
                first=val;
            }
            else if(!val.equals(first)){
                return false;
            }
        }
        return true;
    }
}