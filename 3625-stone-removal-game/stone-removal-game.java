class Solution {
    public boolean canAliceWin(int n) {
        int index=10;
        if(n<index){
            return false;
        }
        while(index>0){
            int k=n-index;
            if(k<index-1){
                return index%2==0;
            }
            n=n-index;
            index--;
        }
        return false;
    }
}