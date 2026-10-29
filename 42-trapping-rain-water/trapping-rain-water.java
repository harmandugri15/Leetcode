class Solution {
    public int trap(int[] height) {
        int left=0;
        int right=height.length-1;

        int maxleft=height[left];
        int maxright=height[right];
        int maxwater=0;

        while(left<right){
           if(height[left]<height[right]){
                left++;
                maxleft=Math.max(maxleft,height[left]);
                maxwater+=maxleft-height[left];
           }
           else{
                right--;
                maxright=Math.max(maxright,height[right]);
                maxwater+=maxright-height[right];
           }
        }
        return maxwater;
    }
}