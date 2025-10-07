import java.util.Arrays;
import java.util.List;

class ZE {
    public static void main(String[] args) {
        Integer[] x = {12, 67, 34, 7, 89, 53};

        List<Integer> list = Arrays.asList(x);

        for(int i=0;i<x.length;i++)
            System.out.print(x[i] + " ");

        System.out.println();

        System.out.println(list);
        
        // list.set(2, 99);
        x[2] = 999;
        
        System.out.println(list);
    }
}