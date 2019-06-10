//class ListNode {
//    int val;
//    ListNode next;
//    ListNode(int x) { val = x; }
// }

public class RemoveLinkedListElements_203 {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        ListNode node = head;
        while (node.next != null) {
            if (node.next.val == val) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }

        if (head.val == val) {
            return head.next;
        } else {
            return head;
        }

    }
}
