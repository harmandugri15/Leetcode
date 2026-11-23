class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int left = 0;
        int currsum = 0;
        int count = 0;
        
        for (int i = 0; i < nums.length; i++) {
            int right = nums[i];
            currsum += right;
            while (left < i && currsum > goal) {
                currsum -= nums[left];
                left++;
            }
            if (currsum == goal) {
                count++;
                int temp = left;
                while (temp < i && nums[temp] == 0) {
                    count++;
                    temp++;
                }
            }
        }
        return count;
    }
}
