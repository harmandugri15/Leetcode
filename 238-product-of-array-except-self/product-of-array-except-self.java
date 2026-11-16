class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] x=new int[n];
        Arrays.fill(x,1);
        int pre=1;
        int suff=1;
        for(int i=0;i<n;i++){
            x[i]*=pre;
            pre*=nums[i];

            x[n-1-i]*=suff;
            suff*=nums[n-1-i];
        }
        return x;
    }
}