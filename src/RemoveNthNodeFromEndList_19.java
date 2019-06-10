//import java.util.HashMap;
//
//public class RemoveNthNodeFromEndList_19 {
//    public ListNode removeNthFromEnd(ListNode head, int n) {
//        if (head == null) return null;
//        HashMap<Integer, Integer> map = new HashMap<>();
//        int size = 0;
//        while (head.next != null) {
//            map.put(size, head.val);
//            size++;
//        }
//
//        ListNode copy = new ListNode(map.get(0));
//        while (size > 0) {
//            size--;
//            if (size + n != map.size()) {
//                copy.next.val = map.get(size);
//            }
//        }
//
//        return copy;
//
//    }
//}
