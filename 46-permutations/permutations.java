class Solution {
    public static void pp(int[] nums,ArrayList<Integer> list,List<List<Integer>> result,boolean[] used){
        if(list.size()==nums.length){
            result.add(new ArrayList(list));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i]==true){
                continue;
            }
            list.add(nums[i]);
            used[i]=true;
            pp(nums,list,result,used);

            list.remove(list.size()-1);
            used[i]=false;
        }

    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList();
        boolean[] used=new boolean[nums.length];
        pp(nums,new ArrayList<>(),result,used);
        return result;
    }
}