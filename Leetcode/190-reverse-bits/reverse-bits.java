class Solution {
    public int reverseBits(int n) {
        ArrayList<Character> arr=new ArrayList<>();
        for(int i=0;i<32;i++){
            int digit=n%2;
            if(digit==1){
                arr.add('1');
            }
            else{
                arr.add('0');
            }
            n=n>>>1;
        }
        long result = 0;
        for (char c : arr) {
            result = result * 2 + (c - '0');
        }
        return (int) result;

    }
}