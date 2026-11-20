class Solution {
    public int subarraySum(int[] nums, int k) {
       HashMap<Integer,Integer> hmap=new HashMap<>();
       hmap.put(0,1);
       int prefixsum=0;
       int count=0;
       for(int num:nums){
        prefixsum+=num;
        if(hmap.containsKey(prefixsum-k)){
            count+=hmap.get(prefixsum-k);
        }
        hmap.put(prefixsum,hmap.getOrDefault(prefixsum,0)+1);
       }
       return count;
    }
}