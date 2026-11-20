class Solution {
    public int maxSelectedElements(int[] nums) {
        HashMap<Integer,Integer> hmap=new HashMap<>();
        Arrays.sort(nums);
        int count=0;
        for(int x:nums){
            int val1=hmap.getOrDefault(x,0)+1;
            int val2=hmap.getOrDefault(x-1,0)+1; // length of prev ending 

            int next=Math.max(hmap.getOrDefault(x+1,0),val1);
            int curr=Math.max(hmap.getOrDefault(x,0),val2);
            hmap.put(x+1,next);
            hmap.put(x,curr);
            count=Math.max(count,Math.max(next,curr));
        }
        return count;
        
    }
}