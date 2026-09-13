/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public static ListNode rev(ListNode head,int k){
        if(head==null){
            return head;
        }
        ListNode curr=head;
        ListNode prev=null;
        for(int i=0;i<k;i++){
            ListNode currnext=curr.next;
            curr.next=prev;
            prev=curr;
            curr=currnext;
        }
        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null){
            return head;
        }
        ListNode a=head;
        for(int i=0;i<k;i++){
            if(a==null){
                return head;
            }
            a=a.next;
        }
        ListNode firstbatch=head;
        ListNode nd=a;
        ListNode reversehead=rev(firstbatch,k);

        firstbatch.next=reverseKGroup(nd,k);
        return reversehead;
    }
}