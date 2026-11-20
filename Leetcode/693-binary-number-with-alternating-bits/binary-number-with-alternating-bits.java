class Solution {
    public boolean hasAlternatingBits(int n) {
        int index=0;
        int prev=-1;
        while(n>0){
            int digit=n%2;
            n=n/2;
            if(digit==prev){
                return false;
            }
            prev=digit;
        }
        return true;
    }
}