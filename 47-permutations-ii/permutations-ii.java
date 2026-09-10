class Solution {

    public static void backtrack(int[] nums,boolean[] used,ArrayList<Integer> list,List<List<Integer>> result){
        if(nums.length==list.size()){
            result.add(new ArrayList(list));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i]){
                continue;
            }

            list.add(nums[i]);
            used[i]=true;
            backtrack(nums,used,list,result);
            
            list.remove(list.size()-1);
            used[i]=false;
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        boolean[] bb=new boolean[nums.length];
        backtrack(nums,bb,new ArrayList<>(),result);
        HashSet<List<Integer>> hset=new HashSet<>();
        for(List i:result){
            hset.add(i);
        }
        List<List<Integer>> result1=new ArrayList<>();
        for(List i:hset){
            result1.add(i);
        }
        return result1;
    }
}