class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int sum1 = 0;
        int sum2 = 0;
        int n = nums.length;
        int ans = 0;

        for (int i : nums) {
            sum1 += i;
            sum2 -= i;

            if (sum1 < 0) sum1 = 0;
            if (sum2 < 0) sum2 = 0;

            ans = Math.max(ans, Math.max(sum1, sum2));
        }

        return ans;
    }
}
