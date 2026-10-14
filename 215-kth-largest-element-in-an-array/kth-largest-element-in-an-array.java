class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int x=nums.length-k;
        return nums[x];
    }
}