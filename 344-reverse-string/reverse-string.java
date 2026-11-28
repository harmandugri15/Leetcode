class Solution {
    public void helper(char[] s,int left,int right){
        if(left>=right){
            return;
        }
            char a=s[left];
            s[left]=s[right];
            s[right]=a;
        helper(s,left+1,right-1);
    }
    public void reverseString(char[] s) {
        helper(s,0,s.length-1);
    }
}