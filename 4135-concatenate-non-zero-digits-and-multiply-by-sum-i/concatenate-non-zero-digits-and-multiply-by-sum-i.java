class Solution {
    public long sumAndMultiply(int n) {
        long ans=0;
        int rev=0;
        int sum=0;
        long temp=0;
        while(n!=0){
            int rem=n%10;
            sum+=rem;
            if(rem!=0){
                ans=ans*10+rem;
            }
            n/=10;
        }
        while(ans!=0){
            int rem=(int)ans%10;
            temp=temp*10+rem;
            ans/=10;
        }
        return temp*sum;
    }
}