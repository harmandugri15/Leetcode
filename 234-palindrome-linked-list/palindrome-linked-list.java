class Solution {
    private ListNode front;

    public boolean isPalindrome(ListNode head) {
        front = head;
        return check(head);
    }

    private boolean check(ListNode current) {
        if (current == null) {
            return true;
        }
        
        // Recurse to the end of the list first
        if (!check(current.next)) {
            return false;
        }
        
        // Compare values as the stack unwinds
        if (current.val != front.val) {
            return false;
        }
        
        // Move the front pointer forward
        front = front.next;
        return true;
    }
}
