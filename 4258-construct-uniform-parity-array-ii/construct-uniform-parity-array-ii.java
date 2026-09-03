class Solution {
    public boolean uniformArray(int[] nums1) {
        int so = Integer.MAX_VALUE;
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] % 2 != 0) {
                so = Math.min(so, nums1[i]);
            }
        }
        if (so == Integer.MAX_VALUE)
            return true;
        for (int n : nums1) {
            if (n % 2 == 0 && n <= so) {
                return false;
            }
        }
        return true;
    }
}