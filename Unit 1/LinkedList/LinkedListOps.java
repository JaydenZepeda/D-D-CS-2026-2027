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
        // if (start == null) {
        // return false;
        // }
        // ArrayList<ListNode> nodes = new ArrayList<>();
        // nodes.add(start);
        // for (ListNode node = start.getNext(); node != null; node = node.getNext()) {
        // if (nodes.contains(node)) {
        // return true;
        // }
        // nodes.add(node);
        // }
        // return false;
    }
}
