class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] t=Arrays.copyOf(arr,arr.length);
        Arrays.sort(t);
        HashMap<Integer,Integer> hm=new HashMap<>();
        int r=1;
        for(int e :t){
            if(!hm.containsKey(e)){
                hm.put(e,r++);
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=hm.get(arr[i]);
        }
        return arr;
    }
}