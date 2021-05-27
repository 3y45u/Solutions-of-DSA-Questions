// This code is the basic idea of checking if a linked list is palindrome or not
// The linked list is divided into to parts and the next half of list is reversed 
// if both the parts of list are equal it is a palindrome
// this is the one of the short method 
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast !=null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        slow = reversed(slow);
        fast = head;
        
        while(slow!=null)
        {
            if(slow.val != fast.val)
            {
                return false;
            }
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }
    public ListNode reversed(ListNode head)
    {
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;
        
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        return prev;
    }
}
