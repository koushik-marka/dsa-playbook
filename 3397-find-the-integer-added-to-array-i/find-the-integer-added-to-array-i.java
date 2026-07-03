class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int m1=nums1[0];
        int m2=nums2[0];
        for(int i=0;i<nums1.length;i++){
            if(m1>nums1[i]) m1=nums1[i];
            if(m2>nums2[i]) m2=nums2[i];
        }
        return m2-m1;
    }
}