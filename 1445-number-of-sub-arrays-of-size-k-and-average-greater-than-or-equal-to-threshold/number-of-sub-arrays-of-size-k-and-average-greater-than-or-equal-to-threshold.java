class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count=0;
        for(int i=0;i<=arr.length-k;i++){
            int sum=0;
            int kk=0;
            while(kk<k && kk<arr.length){
                sum+=arr[i+kk];
                kk++;
            }
            if((sum/k)>=threshold){
                count++;
            }
        }
        return count;
    }
}