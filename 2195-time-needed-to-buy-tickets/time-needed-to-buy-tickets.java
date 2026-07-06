class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int av=0;
        for(int i=0;i<tickets.length;i++){
            if(i<=k){
                av+=Math.min(tickets[i],tickets[k]);
            }
            else{
                av+=Math.min(tickets[i],tickets[k]-1);
            }
        }
        return av;
    }
}