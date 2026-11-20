class Solution {
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> arr=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            arr.add(temp.val);
            temp=temp.next;
        }
        int index=0;
        for(int i=arr.size()-1;i>=0;i--,index++){
            if(arr.get(index)!=arr.get(i)){
                return false;
            }
        }
        return true;
    }
}