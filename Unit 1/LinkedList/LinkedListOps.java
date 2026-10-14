import java.util.ArrayList;

public class LinkedListOps {
    // returns whether or not the list which begins at "start" has a loop in it ie
    // one of the nodes points to an earlier node in the list
    public static boolean hasLoop(ListNode start) {
        if (start == null) {
            return false;
        }
        ListNode fast = start;
        for (ListNode slow = start; slow != null; slow = slow.getNext()) {
            fast.getNext().getNext();
            if (slow == fast) {
                return true;
            }
        }
        return false;
        
        // rempove nodes value from many linkedlist it might be in
        public static void delete(ListNode node) {
            node.setValue(node.getNext().getValue());
            node.setNext(node.getNext().getNext());
            return;
        }
        
        public static void printListInReverse(ListNode head) {
            for(ListNode node = head; node =! null; node = node.getNext()) {
              
            }
        }
    }
}
