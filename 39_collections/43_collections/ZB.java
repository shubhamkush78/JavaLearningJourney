import java.util.Arrays;
import java.util.List;

class ZB {
    public static void main(String[] args) {
        Integer[] x = {12, 67, 34, 7, 89, 53};

        List<Integer> list = Arrays.asList(x);

        for(int i=0;i<x.length;i++)
            System.out.print(x[i] + " ");

        System.out.println();

        System.out.println(list);

        list.add(99);
    }
}


// Exception in thread "main" java.lang.UnsupportedOperationException
//         at java.base/java.util.AbstractList.add(AbstractList.java:153)
//         at java.base/java.util.AbstractList.add(AbstractList.java:111)
//         at ZB.main(ZB.java:17)