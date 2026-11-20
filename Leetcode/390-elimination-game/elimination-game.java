class Solution {
    public int lastRemaining(int n) {
        boolean lefttoright=true;
        int remaining=n;
        int head=1;
        int step=1;
        while(remaining>1){
            if(lefttoright || remaining%2==1){
                head+=step;
            }
            remaining/=2;
            step=step*2;
            lefttoright=!lefttoright;
        }
        return head;
    }
}