import java.util.HashMap;

class Solution {
    public int subarraysWithKDistinct(int[] arr, int k) {
        int left = 0;
        int total = 0;
        int prefixCount = 0;
        HashMap<Integer, Integer> hmap = new HashMap<>();
        
        for (int right = 0; right < arr.length; right++) {
            hmap.put(arr[right], hmap.getOrDefault(arr[right], 0) + 1);
            
            if (hmap.size() > k) {
                hmap.put(arr[left], hmap.get(arr[left]) - 1);
                if (hmap.get(arr[left]) == 0) {
                    hmap.remove(arr[left]);
                }
                left++;
                prefixCount = 0; 
            }
            

            while (hmap.size() == k && hmap.get(arr[left]) > 1) {
                hmap.put(arr[left], hmap.get(arr[left]) - 1);
                left++;
                prefixCount++;
            }
            
            if (hmap.size() == k) {
                total += (1 + prefixCount);
            }
        }
        return total;
    }
}
