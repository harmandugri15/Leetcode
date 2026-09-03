class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        int product=Integer.MIN_VALUE;
        int currproduct=1;
        for(int i=0;i<n;i++){
            currproduct=currproduct*nums[i];
            product=Math.max(currproduct,product);
            if (currproduct == 0) {
                currproduct = 1;
            }
        }
        currproduct = 1; 
        for (int i = n - 1; i >= 0; i--) { 
            currproduct = currproduct * nums[i]; 
            product = Math.max(currproduct, product); 
            
            // FIX: If we hit a 0, reset to 1 to start a fresh subarray
            if (currproduct == 0) {
                currproduct = 1;
            }
        } 

        return product;

    }

}