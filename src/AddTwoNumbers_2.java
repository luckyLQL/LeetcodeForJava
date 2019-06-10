/**
 * Definition for singly-linked list.
 */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
 }


public class AddTwoNumbers_2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1.next == null) {
            l1.next = l2.next;
            return l1;
        }
        if (l2.next == null) {
            l2.next = l1.next;
            return l2;
        }
        else{
            addTwoNumbers(l1.next, l2.next);
            l1.val = l1.val + l2.val;
            return l1;
        }
    }


}
