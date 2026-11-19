class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int high=0;
        for(int i:piles){
            high=Math.max(high,i);
        }
        int ans=high;
        int low=1;
        while(high>=low){
            int middle=low+(high-low)/2;
            long currhours=0;
            for(int i:piles){
                currhours+=(i+middle-1)/middle;
            }
            if(currhours<=h){
                ans=middle;
                high=middle-1;
            }
            else{
                low=middle+1;
            }
        }
        return ans;
    }
}