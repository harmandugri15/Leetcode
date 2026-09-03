class Solution {
    public int lengthOfLongestSubstring(String se) {

        boolean[] inWindow = new boolean[128];
        char[] s = se.toCharArray();
        int n = s.length;
        
        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < n; right++) {
            char currentChar = s[right];

            while (inWindow[currentChar]) {
                inWindow[s[left]] = false;
                left++;
            }
            inWindow[currentChar] = true;

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
