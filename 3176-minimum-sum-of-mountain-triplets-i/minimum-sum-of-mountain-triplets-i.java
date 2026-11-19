class Solution {
    public int minimumSum(int[] nums) {
        int minsum = Integer.MAX_VALUE;
        int n = nums.length;
        
        for (int i = 0; i < n - 2; i++) {
            int start = i + 1;
            int end = n - 1;
            int sum = 0;
            while (start < end) {

                if (nums[i] < nums[start] && nums[end] < nums[start]) {
                    sum = nums[i] + nums[start] + nums[end];
                    minsum = Math.min(minsum, sum);
                }
                if (end - start > 1) {
                    end--;
                } else {
                    start++;
                    end = n - 1;
                }
            }
        }
        
        if (minsum == Integer.MAX_VALUE) {
            return -1;
        } else {
            return minsum;
        }
    }
}
