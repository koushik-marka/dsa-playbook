class Solution {
public:
    int maxProduct(int n) {
        int m=0;
        int sm=0;
        while(n>0){
            int rem=n%10;
            if(rem>m){
                sm=m;
                m=rem;
            }
            else if(rem>sm){
                sm=rem;
            }
            n/=10;
        }
        return(m*sm);
    }
};