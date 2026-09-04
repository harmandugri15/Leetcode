class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int currsum=0;
        for(int i=0;i<k;i++){
            currsum+=nums[i];
        }
        int maxsum=currsum;
        for(int i=k;i<nums.length;i++){
            currsum=currsum-nums[i-k]+nums[i];
            maxsum=Math.max(currsum,maxsum);
        }
        double avg=(double)maxsum/k;
        return avg;

    }
}