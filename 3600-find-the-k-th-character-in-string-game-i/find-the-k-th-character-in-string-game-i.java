class Solution {
    public char kthCharacter(int k) {
        if(k==1){
            return 'a';
        }
        int half=1;
        while(half*2<k){
            half=half*2;
        }
        char c=kthCharacter(k-half);
        if(c=='z'){
            return 'a';
        }
        else{
            return (char) (c+1);
        }
    }
}