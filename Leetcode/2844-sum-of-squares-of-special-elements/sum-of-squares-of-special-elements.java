class Solution {
    public int sumOfSquares(int[] nums) {
        int sum=0;
        int n=nums.length;
        sum+=nums[0]*nums[0];
        for(int i=1;i<n;i++){
            if(n%(i+1)==0){
                sum+=(nums[i]*nums[i]);
            }
        }
        return sum;
    }
}