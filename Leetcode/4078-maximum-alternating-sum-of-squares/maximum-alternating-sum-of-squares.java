class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                nums[i]=-1*nums[i];
            }
        }
            long answer=0;
            Arrays.sort(nums);
            long ngsum=0;
            long  posum=0;
            for(int i=0;i<n/2;i++){
                ngsum +=nums[i]*nums[i];
            }
            for(int i=n/2;i<n;i++){
                posum+=nums[i]*nums[i];
            }
            return posum-ngsum;
        
    }
}