class Solution {
    public boolean checkDivisibility(int n) {
        int k=n;
        int product=1;
        int sum=0;
        while(k>0){
            int a=k%10;
            sum+=a;
            product*=a;
            k=k/10;
        }
        if(n%(sum+product)==0){
            return true;
        }
        else{
            return false;
        }
    }
}