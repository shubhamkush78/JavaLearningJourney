import java.util.ArrayList;

class O {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(11);
        list.add(2);
        list.add(4);
        list.add(7);
        list.add(5);

        System.out.println(list);
        System.out.println(list.remove(20));
        System.out.println(list);
    }
}



// [11, 2, 4, 7, 5]
// Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 20 out of bounds for length 5
//         at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
//         at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
//         at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
//         at java.base/java.util.Objects.checkIndex(Objects.java:359)
//         at java.base/java.util.ArrayList.remove(ArrayList.java:504)
//         at O.main(O.java:14)