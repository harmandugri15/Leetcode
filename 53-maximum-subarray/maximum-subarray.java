class Solution {
    public int maxSubArray(int[] nums) {
        int currsum=0;
        int maxsum=nums[0];
        for(int right=0;right<nums.length;right++){
            currsum+=nums[right];
            maxsum=Math.max(maxsum,currsum);

            if(currsum<0){
                currsum=0;
            }
        }
        return maxsum;
    }
}