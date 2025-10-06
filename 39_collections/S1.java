import java.util.ArrayList;

class S1 {
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<Integer>();

        x.add(23);
        x.add(56);
        x.add(19);

        System.out.println(x);
        x.add(4, 99);
        System.out.println(x);
    }
}

// [23, 56, 19]
// Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 4, Size: 3
//         at java.base/java.util.ArrayList.rangeCheckForAdd(ArrayList.java:756)
//         at java.base/java.util.ArrayList.add(ArrayList.java:481)
//         at S1.main(S1.java:12)
