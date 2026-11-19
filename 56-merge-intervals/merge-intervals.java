class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(i,j) ->Integer.compare(i[0],j[0]));
        List<int[]> ans=new ArrayList<>();
        int[] prev=intervals[0];
        for(int i=1;i<intervals.length;i++){
            if(prev[1]>=intervals[i][0]){
                prev[1]=Math.max(prev[1],intervals[i][1]);
            }
            else{
                ans.add(prev);
                prev=intervals[i];
            }
        }
        ans.add(prev);
        int[][] a=new int[ans.size()][2];
        for(int i=0;i<ans.size();i++){
            for(int j=0;j<2;j++){
                a[i][j]=(ans.get(i))[j];
            }
        }
        return a;
    }
}