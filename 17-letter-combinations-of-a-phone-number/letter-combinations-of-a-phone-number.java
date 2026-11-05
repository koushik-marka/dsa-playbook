class Solution {
    List<String> al=new ArrayList<>();
    void fun(String d,int idx,String arr[],String s){
        if(s.length()==d.length()){
            al.add(s);
            return;
        }
        if(idx>=d.length()){
            return;
        }
        String k=arr[d.charAt(idx)-'0'];
        
        for(int i=0;i<k.length();i++){
            fun(d,idx+1,arr,s+k.charAt(i));
        }
    }
    public List<String> letterCombinations(String digits) {
        String arr[]={"","","abc","def","ghi","jkl","mno","pqrs","tvu","wxyz"};
        fun(digits,0,arr,"");
        return al;
    }
}