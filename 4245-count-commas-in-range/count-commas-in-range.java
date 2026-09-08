class Solution {
    public int countCommas(int n) {
        int a=0;
        int threshold=1000;
        while(n>=threshold){
            a+=(n-threshold+1);
            threshold*=1000;
        }
        return a;
    }
}
