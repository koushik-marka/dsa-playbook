class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {

        Map<Integer, Set<Integer>> mpp = new HashMap<>();
        for (int[] r : reservedSeats) {
            mpp.computeIfAbsent(r[0], k -> new HashSet<>()).add(r[1]);
        }

        int av = 0;
        for (int i : mpp.keySet()) {
            Set<Integer> reserved = mpp.get(i);
            for (int s = 2; s <= 6; s += 2) {
                if (!reserved.contains(s) && !reserved.contains(s + 1) && !reserved.contains(s + 2)
                        && !reserved.contains(s + 3)) {
                    av++;
                    s += 2; 
                }
            }
        }
        av += (n - mpp.size()) * 2;
        return av;
    }
}