class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hmap=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hmap.put(nums[i],hmap.getOrDefault(nums[i],0)+1);
        }
        for(int i:hmap.keySet()){
            if(hmap.get(i)!=3){
                return i;
            }
        }
        return -1;
    }
}