class Solution {
    public char kthCharacter(int k) {
        StringBuilder sb=new StringBuilder("a");
        while(sb.length() < k){
            int curr=sb.length();
            for(int i=0;i<curr;i++){
                if(sb.charAt(i)=='z'){
                    sb.append('a');
                }
                else{
                    sb.append(  (char) (sb.charAt(i)+1)  );
                }
            }
        }
        return sb.charAt(k-1);
    }
}