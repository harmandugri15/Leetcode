class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int[] suffix=new int[n];
        int mn=Integer.MAX_VALUE;
        for(int i=n-1;i>=0;i--){
            mn=Math.min(nums[i],mn);  
            suffix[i]=mn;
        }
        int mx=0;
        int score=0;
        for(int i=0;i<n;i++){
            mx=Math.max(mx,nums[i]);
            score=mx-suffix[i];
            if(score<=k){
                return i;
            }
        }
        return -1;
    }
}