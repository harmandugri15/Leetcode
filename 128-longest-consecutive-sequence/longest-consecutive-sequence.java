class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        HashSet<Integer> hset=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hset.add(nums[i]);
        }
        int maxcount=0;
        for(int num:hset){
            if(!hset.contains(num-1)){
                int x=num;
                int count=0;
                while(hset.contains(x+1)){
                    count++;
                    x=x+1;
                }
                maxcount=Math.max(maxcount,count);
            }
            
        }
        return maxcount+1;
    }
}