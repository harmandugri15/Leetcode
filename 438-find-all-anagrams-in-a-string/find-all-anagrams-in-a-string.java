class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans=new ArrayList<>();
        int n1=s.length();
        int n2=p.length();
        if(n2>n1){
            return ans; 
        }
        int[] arr1=new int[26];
        int[] arr2=new int[26];// big one
        for(int i=0;i<n2;i++){
            arr1[p.charAt(i)-'a']++;
            arr2[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(arr1,arr2)){
            ans.add(0);
        }
        for(int i=n2;i<n1;i++){
            arr2[s.charAt(i)-'a']++;
            arr2[s.charAt(i-n2)-'a']--;
            if(Arrays.equals(arr2,arr1)){
                ans.add(i-n2+1);
            }
        }
        return ans;
    }
}