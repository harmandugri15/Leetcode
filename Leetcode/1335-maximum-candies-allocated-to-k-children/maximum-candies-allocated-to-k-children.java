class Solution {
    public int maximumCandies(int[] candies, long k) {
        int high=0;
        for(int i:candies){
            high=Math.max(high,i);
        }
        int low=1;
        int ans=0;
        while(high>=low){
            int middle=low+(high-low)/2;
            long currcandies=0;
            for(int i:candies){
                currcandies+=i/middle;
            }
            if(currcandies>=k){
                ans=middle;
                low=middle+1;
            }
            else{
                high=middle-1;
            }
        }
        return ans;
    }
}