class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> hmap=new HashMap<>();
        int[] arr=new int[2];
        for(int i=0;i<nums.length;i++){
            hmap.put(nums[i],hmap.getOrDefault(nums[i],0)+1);
        }
        int index=0;
        for(int i:hmap.keySet()){
            if(hmap.get(i)!=2){
                arr[index++]=i;
            }
        }
        return arr;
    }
}