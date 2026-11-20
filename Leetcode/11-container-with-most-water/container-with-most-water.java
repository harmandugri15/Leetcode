class Solution {
    public int maxArea(int[] height) {
        int area=0;
        int maxarea=0;

        int start=0;
        int end=height.length-1;
        while(start<=end){
            int height1=height[start];
            int height2=height[end];
            area=(Math.min(height1,height2) ) * (end-start);
            maxarea=Math.max(area,maxarea);

            if(height2<=height1){
                end--;
            }
            if(height1<height2){
                start++;
            }
        }
        return maxarea;
    }
}