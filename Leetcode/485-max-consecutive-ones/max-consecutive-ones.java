class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int left=-1;
        int n=nums.length;
        int maxlen=0;
        for(int right=0;right<n;right++){
            if(nums[right]!=1){
                left=right;
            }
            maxlen=Math.max(maxlen,right-left);
        }
        return maxlen;
    }
}