class Solution {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character,Integer> hmap=new LinkedHashMap();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            hmap.put(ch,hmap.getOrDefault(ch,0)+1);
        }
        char found='0';
        for(char x:hmap.keySet()){
            if(hmap.get(x)==1){
                found=x;
                break;
            }
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==found){
                return i;
            }
        }
        return -1;
    }
}