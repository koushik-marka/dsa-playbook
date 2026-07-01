class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int avj=0;
        char arr[]=stones.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(jewels.contains(String.valueOf(arr[i]))) avj++;
        }
        return avj;
    }
}