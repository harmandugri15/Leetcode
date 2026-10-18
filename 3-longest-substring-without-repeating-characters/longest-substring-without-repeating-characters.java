class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        char[] x=s.toCharArray();
        int n=x.length;
        int maxlen=0;
        boolean[] inwindow=new boolean[150];
        for(int right=0;right<n;right++){
            char ch=x[right];
            while(inwindow[ch]){
                inwindow[x[left]]=false;
                left++;
            }
            inwindow[ch]=true;
            maxlen=Math.max(maxlen,right-left+1);
        }
        return maxlen;
    }
}