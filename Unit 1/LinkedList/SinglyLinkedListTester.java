public class SinglyLinkedListTester {
    public static void main(String[] args) {
        SinglyLinkedList<String> list = new SinglyLinkedList<String>();
        list.add("Hello");
        list.add("there");
        list.add("Poo");
        System.out.println(list.toString());
        list.add("You");
        System.out.println(list.toString());
        System.out.println(list.size());
    }
}
