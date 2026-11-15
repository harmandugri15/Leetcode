class Solution {
    public int numOfSubarrays(int[] arr) {
        int n = arr.length;
        int oddsum = 0;
        int sum = 0;
        
        int evenCount = 1; // Counts how many even sums we have seen so far (starts at 1 for sum = 0)
        int oddCount = 0;  // Counts how many odd sums we have seen so far

        // Only ONE loop now!
        for (int right = 0; right < n; right++) {
            sum += arr[right];
            
            if (sum % 2 == 1) {
                oddsum = (oddsum + evenCount) % 1000000007;
                oddCount++;
            } else {
                oddsum = (oddsum + oddCount) % 1000000007;
                evenCount++;
            }
        }
        
        return oddsum;
    }
}
