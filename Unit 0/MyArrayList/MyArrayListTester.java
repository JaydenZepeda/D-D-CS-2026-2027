import java.util.ArrayList;

public class MyArrayListTester {

    public static void main(String[] args) {
        MyArrayList<String> testSubjects = new MyArrayList<String>();

        testSubjects.add("Poo");
        testSubjects.add("You");
        testSubjects.add(null);
        testSubjects.remove(null);

    }
}
