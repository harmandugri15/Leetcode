class Solution {
    public int maxProfit(int[] arr) {
        int maxprofit=0;
        int minprice=arr[0];
        for(int i=1;i<arr.length;i++){
            maxprofit=Math.max(maxprofit,arr[i]-minprice);
            minprice=Math.min(arr[i],minprice);
        }
        return maxprofit;
    }
}