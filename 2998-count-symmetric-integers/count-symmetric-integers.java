class Solution {
    boolean is_sym(int n){
        String s=String.valueOf(n);
        if(s.length()%2!=0) return false;
        int i=(s.length())/2;
        int sum=0;
        int j=0;
        while(j<i){
            sum+=s.charAt(j)-'0';
            j++;
        }
        while(j<i*2){
            sum-=s.charAt(j)-'0';
            j++;
        }
        return sum==0;
    }
    public int countSymmetricIntegers(int low, int high) {
        int c=0;
        for(int i=low;i<=high;i++){
            if(is_sym(i)) c++;
        }
        return c;
    }
}