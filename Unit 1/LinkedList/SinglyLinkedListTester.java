public class SinglyLinkedListTester {
    public static void main(String[] args) {
        SinglyLinkedList<String> list = new SinglyLinkedList<String>();

        System.out.println(list.isEmpty()); // should be true
        System.out.println(list.size()); // should be 0
        System.out.println(list.toString()); // should be []

        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list.toString()); // [A, B, C]
        System.out.println(list.size()); // 3
        System.out.println(list.getHead().getValue()); // A
        System.out.println(list.getTail().getValue()); // C

        System.out.println(list.contains("B")); // true
        System.out.println(list.contains("D")); // false
        System.out.println(list.indexOf("A")); // 0
        System.out.println(list.indexOf("C")); // 2
        System.out.println(list.indexOf("D")); // -1

        System.out.println(list.get(0)); // A
        System.out.println(list.get(1)); // B
        System.out.println(list.get(2)); // C

        System.out.println(list.set(1, "X"));
        System.out.println(list.toString()); // [X, B, C]

        list.add(0, "First"); // [First, X, B, C]
        System.out.println(list.toString()); // ^^^^
        list.add(2, "Middle");
        System.out.println(list.toString()); // [First, X, Middle, B, C]
        list.add(list.size(), "Last");
        System.out.println(list.toString()); //

        list.add("X");
        list.add("X");
        System.out.println(list.toString());
        System.out.println(list.indexOf("X"));

        System.out.println(list.remove("X"));
        System.out.println(list.toString());
        System.out.println(list.remove("D"));

        System.out.println(list.remove(0));
        System.out.println(list.toString());
        System.out.println(list.remove(1));
        System.out.println(list.toString());
        System.out.println(list.remove(list.size() - 1));
        System.out.println(list.toString());

        while (!list.isEmpty()) {
            list.remove(0);
        }
        System.out.println(list.toString());
        System.out.println(list.isEmpty());

        String[] values = { "One", "Two", "Three" };
        SinglyLinkedList<String> list2 = new SinglyLinkedList<String>(values);
        System.out.println(list2.toString());
        System.out.println(list2.size());

        ListNode<String> node = new ListNode<String>("Hello");
        System.out.println(node.getValue());
        System.out.println(node.getNext());
        node.setValue("Bye");
        System.out.println(node.getValue());
        node.setNext(new ListNode<String>("Next"));
        System.out.println(node.getNext().getValue());
    }
}
