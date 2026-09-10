class Solution {
    public static ListNode reverse(ListNode head,int k){
       ListNode prev=null;
       ListNode curr=head;
       for(int i=0;i<k;i++){
            ListNode currnext=curr.next;
            curr.next=prev;
            prev=curr;
            curr=currnext;
       }
       return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode aa=head;
        for(int i=0;i<k;i++){
            if(aa==null){
                return head;
            }
            aa=aa.next;
        }

        ListNode firstgroup=head;
        ListNode nextgroup=aa;

        ListNode reversedhead=reverse(firstgroup,k);

        firstgroup.next=reverseKGroup(nextgroup,k);

        return reversedhead;

    }
}