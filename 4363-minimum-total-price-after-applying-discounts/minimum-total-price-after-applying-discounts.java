class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        int l1=prices.length;
        int l2=discounts.length;
        Arrays.sort(prices);
        Arrays.sort(discounts);
        int i=l1-1,j=l2-1;
        double s=0;
        while(i>=0 && j>=0){
            s=s+ prices[i]*(100.0-discounts[j])/100.0;
            i--;
            j--;
        }
        while(i>=0){
            s=s+prices[i];
            i--;
        }
        return s;
    }
}