class Solution {
    public int findMin(int[] nums) {
        int curr=nums[0];
        int maxcurr=nums[0];
        for(int i=0;i<nums.length;i++){
            curr=nums[i];
            maxcurr=Math.min(maxcurr,curr);
        }
        return maxcurr;
    }
}