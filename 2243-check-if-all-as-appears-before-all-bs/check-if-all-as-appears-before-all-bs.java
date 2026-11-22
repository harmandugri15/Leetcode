class Solution {
    public boolean checkString(String s) {
        char prev=s.charAt(0);
        for(int i=1;i<s.length();i++){
            if(prev=='b' && s.charAt(i)=='a'){
                return false;
            }
            else{
                prev=s.charAt(i);
            }
        }
        return true;
    }
}