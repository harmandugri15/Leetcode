class Solution {
    public int longestSubarray(int[] nums) {
        int left=0;
        int z=0;
        int maxlen=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int right=nums[i];
            if(right==0){
                z++;
            }
            while(z>1){
                if(nums[left]==0){
                    z--;
                }
                left++;
            }
            maxlen=Math.max(maxlen,i-left);
        }
        return maxlen;
    }
}