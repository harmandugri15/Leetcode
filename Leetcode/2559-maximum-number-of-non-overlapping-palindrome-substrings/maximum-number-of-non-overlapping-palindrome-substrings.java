class Solution {
    public int maxPalindromes(String s, int k) {
        int count = 0;
        int n = s.length();
        int lastEnd = -1;

        for (int i = 0; i < n; i++) {
            int oddLenEnd = findPalindromeEnd(s, i, i, k, lastEnd);
            if (oddLenEnd != -1) {
                count++;
                lastEnd = oddLenEnd;
                continue; 
            }
            int evenLenEnd = findPalindromeEnd(s, i, i + 1, k, lastEnd);
            if (evenLenEnd != -1) {
                count++;
                lastEnd = evenLenEnd;
            }
        }
        return count;
    }

    private int findPalindromeEnd(String s, int left, int right, int k, int lastEnd) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            if (left > lastEnd) {
                int currentLength = right - left + 1;
                if (currentLength >= k) {
                    return right;
                }
            } else {
                break;
            }
            left--;
            right++;
        }
        return -1;
    }
}
