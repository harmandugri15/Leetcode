class Solution {
    public boolean isValid(String s) {
        if(s==null || s.length()==0){
            return true;
        }
        Stack<Character> st=new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
            }
            else{
                if(!st.isEmpty()){
                    int top=st.peek();
                    if(  (ch==')' && top=='(' )  ||  (ch==']' && top=='[' ) || (ch=='}' &&  top=='{' ) ){
                        st.pop();
                    }
                    else{
                        return false;
                    } 
                }
                else{
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}