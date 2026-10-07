class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int hs1[]=new int[1001];
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            hs1[nums1[i]]=1;
        }
        for(int i=0;i<nums2.length;i++){
            if(hs1[nums2[i]]==1){
                arr.add(nums2[i]);
                hs1[nums2[i]]=0;
            }
        }
        int ans[]=new int[arr.size()];
        int i=0;
        for(int d:arr){
            ans[i]=d;
            i++;
        }
        return ans;
    }
}