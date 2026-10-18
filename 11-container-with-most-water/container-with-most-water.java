class Solution {
   
    static {
 
        Solution solver = new Solution(); 
        for (int i = 0; i < 100; i++) {
            solver.maxArea(new int[]{0, 0});
        }
    }

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int minHeight=Math.min(height[left], height[right]);
            int area =  minHeight * (right - left);

            if (area > maxArea) {
                maxArea = area;
            }
        while(left<right && height[left] <= minHeight ){left++;}
        while(left<right && height[right] <= minHeight ){right--;}
        }
        return maxArea;
    }
}