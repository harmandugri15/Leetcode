class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int high=piles[0];
        for(int i=0;i<piles.length;i++){
            high=Math.max(piles[i],high);
        }
        int ans=high;
        int low=1;
        while(high>=low){
            int middle=low + (high-low)/2;

            long currspeed=0;
            for(int p:piles){
                currspeed+=(p+middle-1)/middle;
            }
            if(currspeed<=h){
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