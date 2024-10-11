class Solution {
    public int maxWidthRamp(int[] nums) {
        int ans = 0;
        int len = nums.length;  // Use length instead of size()

        // List of pairs to store (value, index)
        ArrayList<int[]> vp = new ArrayList<>();

        // Fill the list with pairs of (value, index)
        for (int i = 0; i < len; i++) {
            vp.add(new int[]{nums[i], i});  // Use nums[i] instead of nums.get(i)
        }

        // Sort by the first element of each pair (the values)
        Collections.sort(vp, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];  // Sort by the values
            }
        });

        int minIndex = vp.get(0)[1];
        for (int i = 1; i < len; i++) {
            // Calculate the maximum difference of indices
            ans = Math.max(ans, vp.get(i)[1] - minIndex);
            minIndex = Math.min(minIndex, vp.get(i)[1]);
        }

        return ans;
    }
}