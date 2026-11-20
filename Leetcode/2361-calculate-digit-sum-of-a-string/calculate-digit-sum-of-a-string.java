class Solution {
    public String digitSum(String s, int k) {
        String x;
        while(s.length()>k){
            int sum=0;
            int count=0;
            StringBuilder sb=new StringBuilder();
            for(int right=0;right<s.length();right++){
                sum+=s.charAt(right)-'0';
                count++;


                if(count==k || right==s.length()-1){
                    sb.append(sum);
                    count=0;
                    sum=0;
                }
            }
            s=sb.toString();
            
        }
        return s;
    }
}