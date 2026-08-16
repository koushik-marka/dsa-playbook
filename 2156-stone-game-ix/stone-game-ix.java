class Solution {
    public boolean stoneGameIX(int[] stones) {
        int fq[]={0,0,0};
        for(int s:stones){
            fq[s%3]++;
        }
        if((fq[0] & 1)==0){
            return Math.min(fq[1],fq[2]) >0;
        }
        return Math.abs(fq[1]-fq[2])>2;
    }
}