class Solution {
    public int maxProfit(int[] prices) {
        int curr=prices[0];
        int maxprofit=0;
        for(int i=1;i<prices.length;i++){
            int cr=prices[i]-curr;
            maxprofit=Math.max(maxprofit,cr);
            curr=Math.min(curr,prices[i]);
        }
        return maxprofit;
    }
}