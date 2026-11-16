class Solution {
    public static String s(String a){
        char[] a1=a.toCharArray();
        Arrays.sort(a1);
        StringBuilder sb=new StringBuilder();
        for(char x:a1){
            sb.append(x);
        }
        return sb.toString();
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String ,List<String>> map=new HashMap();
        for(int i=0;i<strs.length;i++){
            String word=s(strs[i]);
            if(!map.containsKey(word)){
                map.put(word,new ArrayList<>());
            }
            map.get(word).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}