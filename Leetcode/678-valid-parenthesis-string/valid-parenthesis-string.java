class Solution {
    public boolean checkValidString(String s) {
        int maxnofunmatch=0;
        int minnofunmatch=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                maxnofunmatch++;
                minnofunmatch++;
            }
            else if(s.charAt(i)==')'){
                maxnofunmatch--;
                minnofunmatch--;
            }
            else{
                maxnofunmatch++;
                minnofunmatch--;
            }
            if(maxnofunmatch<0){
                return false;
            }
            if(minnofunmatch<0){
                minnofunmatch=0;
            }

        }
        return minnofunmatch==0;
    }
}