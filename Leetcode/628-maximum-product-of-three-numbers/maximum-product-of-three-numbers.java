import java.util.Arrays;

class Solution {
    public int maximumProduct(int[] nums) {
        // 1. Sorting is mandatory for the window logic to hold true
        Arrays.sort(nums);
        int n = nums.length;
        
        // 2. Initialize the product with the first window (leftmost 3 elements)
        int product = nums[0] * nums[1] * nums[2];
        
        // 3. Slide a window of size 3 across the array
        for (int i = 1; i <= n - 3; i++) {
            int currentWindowProduct = nums[i] * nums[i + 1] * nums[i + 2];
            product = Math.max(product, currentWindowProduct);
        }
        
        // 4. Check the split window case (2 smallest negatives * 1 largest positive)
        int negativeCrossWindow = nums[0] * nums[1] * nums[n - 1];
        
        return Math.max(product, negativeCrossWindow);
    }
}
