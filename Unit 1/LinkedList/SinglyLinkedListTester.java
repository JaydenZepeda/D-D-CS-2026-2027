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

        System.out.println(list.set(1, "X")); // B
        System.out.println(list.toString()); // [A, X, C]

        list.add(0, "First"); // [First, A, X, C]
        System.out.println(list.toString()); // ^^^^
        list.add(2, "Middle");
        System.out.println(list.toString()); // [First, X, Middle, X, C]
        list.add(list.size(), "Last");
        System.out.println(list.toString()); // [First, X, Middle, X, C, Last]

        list.add("X");
        list.add("X");
        System.out.println(list.toString()); // [First, A, Middle, X, C, Last, X, X]
        System.out.println(list.indexOf("X")); // 3

        System.out.println(list.remove("X")); // true
        System.out.println(list.toString()); // [First, A, Middle, C, Last, X, X]
        System.out.println(list.remove("D")); // false

        System.out.println(list.remove(0)); // First
        System.out.println(list.toString()); // [A, Middle, C, Last, X, X]
        System.out.println(list.remove(1)); // Middle
        System.out.println(list.toString()); // [A, C, Last, X, X]
        System.out.println(list.remove(list.size() - 1)); // X
        System.out.println(list.toString()); // [A, C, Last, X]

        while (!list.isEmpty()) {
            list.remove(0);
        }
        System.out.println(list.toString()); // []
        System.out.println(list.isEmpty()); // true

        String[] values = { "One", "Two", "Three" };
        SinglyLinkedList<String> list2 = new SinglyLinkedList<String>(values);
        System.out.println(list2.toString()); // [One, Two, Three]
        System.out.println(list2.size()); // 3
    }
}
