class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] a=new int[101];
        int res=0;
        for(int aa:nums){
            res+=a[aa]++;
        }
        return res;
    }
}