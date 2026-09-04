class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int stableindex=Integer.MAX_VALUE;
        int n=nums.length;
        int[] prefix=new int[n];

        int mn=Integer.MAX_VALUE;
        for(int i=n-1;i>=0;i--){
            mn=Math.min(mn,nums[i]);
            prefix[i]=mn;
        }
        
        int mx=0;
        for(int i=0;i<n;i++){
            mx=Math.max(nums[i],mx);
            int scores=mx-prefix[i];
            if(scores<=k){
                return i;
            }
        }
        return -1;
    }
}