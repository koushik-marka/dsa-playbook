class Solution {
    void sort(int[] arr,int p){
        int i=p;
        while(i>0 &&arr[i-1]>arr[i]){
            int t=arr[i-1];
            arr[i-1]=arr[i];
            arr[i]=t;
            i--;
        }
    }
    public int lastStoneWeight(int[] stones) {
        Arrays.sort(stones);
        int j=stones.length-1;
        while(j>0){
            int c=0;
            int n=stones[j]-stones[j-1];
            if(n==0){
                stones[j]=0;
                stones[j-1]=0;
                j-=2;
            }
            else{
                stones[j]=0;
                stones[j-1]=n;
                sort(stones,j-1);
                j-=1;
            }
        }
        return stones[0];
    }
}