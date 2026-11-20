class Solution {
    public int minMoves(int[] nums) {
        int maxi=nums[0];
        for(int i=0;i<nums.length;i++){
            maxi=Math.max(maxi,nums[i]);
        }
        int count=0;
        for(int i=0;i<nums.length;i++){
            count=count+(maxi-nums[i]);
        }
        return count;
    }
}