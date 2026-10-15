class Solution {
    public int sumCounts(List<Integer> nums) {
        int totalcount=0;
        for(int i=0;i<nums.size();i++){
            HashSet<Integer> hs=new HashSet<>();
            for(int j=i;j<nums.size();j++){
                hs.add(nums.get(j));
                int si=hs.size();
                totalcount+=si* si;
            }
        }
        return totalcount;
    }
}