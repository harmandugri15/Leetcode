import java.util.Arrays;

public class Solution {
    public String lexPalindromicPermutation(String s, String target) {
        int n = s.length();
        int[] cnt = new int[26];
        
        // 1. Calculate frequency distribution
        for (char c : s.toCharArray()) {
            cnt[c - 'a']++;
        }
        
        // 2. Validate palindrome availability
        int oddCount = 0;
        char midChar = '\0';
        for (int i = 0; i < 26; i++) {
            if (cnt[i] % 2 != 0) {
                oddCount++;
                midChar = (char) ('a' + i);
            }
        }
        if (oddCount > 1) {
            return ""; // Palindrome is not possible
        }
        
        // Target budget allocations exclusively for the left half
        int[] leftCounts = new int[26];
        for (int i = 0; i < 26; i++) {
            leftCounts[i] = cnt[i] / 2;
        }
        
        int halfLen = n / 2;
        
        // 3. Attempt an exact prefix match with target's first half
        boolean canExact = true;
        int[] curCounts = leftCounts.clone();
        for (int i = 0; i < halfLen; i++) {
            int tIdx = target.charAt(i) - 'a';
            if (curCounts[tIdx] > 0) {
                curCounts[tIdx]--;
            } else {
                canExact = false;
                break;
            }
        }
        
        if (canExact) {
            String leftPart = target.substring(0, halfLen);
            String fullPal = buildPalindrome(leftPart, midChar);
            if (fullPal.compareTo(target) > 0) {
                return fullPal;
            }
        }
        
        // 4. Backtrack: Look for the rightmost index to place a strictly larger character
        for (int i = halfLen - 1; i >= 0; i--) {
            curCounts = leftCounts.clone();
            boolean possible = true;
            
            // Check if the exact sub-prefix target[0...i-1] can be fulfilled
            for (int j = 0; j < i; j++) {
                int tIdx = target.charAt(j) - 'a';
                if (curCounts[tIdx] > 0) {
                    curCounts[tIdx]--;
                } else {
                    possible = false;
                    break;
                }
            }
            if (!possible) continue;
            
            // Look for the smallest available character strictly greater than target[i]
            int tIdx = target.charAt(i) - 'a';
            int chosenIdx = -1;
            for (int k = tIdx + 1; k < 26; k++) {
                if (curCounts[k] > 0) {
                    chosenIdx = k;
                    break;
                }
            }
            
            if (chosenIdx != -1) {
                curCounts[chosenIdx]--;
                
                // Form the validated left prefix segment
                StringBuilder leftPartSb = new StringBuilder(target.substring(0, i));
                leftPartSb.append((char) ('a' + chosenIdx));
                
                // Fill up trailing spots sequentially in ascending order for lexicographically lowest result
                for (int k = 0; k < 26; k++) {
                    while (curCounts[k] > 0) {
                        leftPartSb.append((char) ('a' + k));
                        curCounts[k]--;
                    }
                }
                
                return buildPalindrome(leftPartSb.toString(), midChar);
            }
        }
        
        return "";
    }
    
    // Helper function to assemble a mirrored palindrome
    private String buildPalindrome(String leftHalf, char midChar) {
        StringBuilder sb = new StringBuilder(leftHalf);
        String reversed = new StringBuilder(leftHalf).reverse().toString();
        if (midChar != '\0') {
            sb.append(midChar);
        }
        sb.append(reversed);
        return sb.toString();
    }
}
