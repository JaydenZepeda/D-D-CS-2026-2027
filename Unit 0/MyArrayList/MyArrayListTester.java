public class MyArrayListTester {
    public static void main(String[] args) {
        MyArrayList<Integer> arrayList = new MyArrayList<Integer>(100);

        Integer num = 1;
        Integer num2 = 3;
        Integer num3 = 2;
        arrayList.add(num);
        System.out.println(arrayList.toString());
        arrayList.add(num2);
        arrayList.add(num3);
        System.out.println(arrayList.toString());
        arrayList.add(1, 3);
        arrayList.remove(num2);
        System.out.println(arrayList.toString());

    }
}
