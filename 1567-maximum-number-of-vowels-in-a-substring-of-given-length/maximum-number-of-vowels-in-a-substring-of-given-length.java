class Solution {
    public static boolean isvowel(char x){
        if(x=='a' || x=='e' || x=='i' || x=='o' || x=='u'){
            return true;
        }
        else{
            return false;
        }
    }
    public int maxVowels(String str, int k) {
        char[] s=str.toCharArray();
        int maxvol=0;
        int left=0;
        int vol=0;
        for(int i=0;i<s.length;i++){
            char right=s[i];
            if(isvowel(right)){
                vol++;
            }

            if(i-left+1==k){
                maxvol=Math.max(maxvol,vol);
                if(isvowel(s[left])){
                    vol--;
                }
                left++;
            }
        }
        return maxvol;
    }
}