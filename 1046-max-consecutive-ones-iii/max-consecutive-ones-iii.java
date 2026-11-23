class Solution {
    public int longestOnes(int[] nums, int k) {
        int zero=0;
        int left=0;
        int maxlen=0;
        for(int i=0;i<nums.length;i++){
            int right=nums[i];
            if(right==0){
                zero++;
            }
            while(zero>k){
                if(nums[left]==0){
                    zero--;
                }
                left++;
            }
            maxlen=Math.max(maxlen,i-left+1);
        }
        return maxlen;
    }
}