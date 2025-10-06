import java.util.ArrayList;

class T {
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<Integer>();

        x.add(23);
        x.add(56);
        x.add(19);

        System.out.println(x);
        // x.add(3, 99);
        x.set(3, 99);
        System.out.println(x);
    }
}



// [23, 56, 19]
// Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 3
//         at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
//         at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
//         at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
//         at java.base/java.util.Objects.checkIndex(Objects.java:359)
//         at java.base/java.util.ArrayList.set(ArrayList.java:441)
//         at T.main(T.java:13)