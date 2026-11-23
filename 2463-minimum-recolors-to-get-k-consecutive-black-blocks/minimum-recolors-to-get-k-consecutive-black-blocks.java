class Solution {
    public int minimumRecolors(String block, int k) {
        char[] blocks=block.toCharArray();
        int left=0;
        int minlen=Integer.MAX_VALUE;
        int whites=0;
        for(int i=0;i<blocks.length;i++){
            if(blocks[i]=='W'){
                whites++;
            }
            if(i-left+1==k){
                minlen=Math.min(minlen,whites);
                if(blocks[left]=='W'){
                    whites--;
                }
                left++;
            }
        }
        return minlen;
    }
}