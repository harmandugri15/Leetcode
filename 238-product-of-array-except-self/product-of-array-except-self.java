class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] x = new int[n];
        int pre = 1;
        int suff = 1;
        for (int i = 0; i < n; i++) {
            x[i] = pre;
            pre *= nums[i];
        }
        for (int i = n - 1; i >= 0; i--) {
            x[i] *= suff;
            suff *= nums[i];
        }
        return x;
    }
}