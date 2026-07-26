class Solution {
    public long maxProduct(int[] nums) {
        long a=0,b=0;
        for(int x:nums){
            if(Math.abs(x)>Math.abs(a)){
                b=a;
                a=Math.abs(x);
            }
            else if(Math.abs(x)>Math.abs(b)){
                b=Math.abs(x);
            }
        }
        return 100000L *a*b;
    }
}