class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        solve(nums,0,new ArrayList<>());
        return ans;
    }
    public void solve(int[] nums,int index,List<Integer> current){
        if(index==nums.length){
            ans.add(new ArrayList<>(current));
            return;
        }
        current.add(nums[index]);
        solve(nums,index+1,current);
        current.remove(current.size()-1);
        solve(nums,index+1,current);
    }
}