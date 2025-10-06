import java.util.HashSet;

class N {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<Integer>();
        
        set.add(23);
        set.add(56);
        set.add(12);
        set.add(9);
        set.add(41);

        Integer a = Integer.valueOf(12);
        boolean flag = set.contains(a);

        System.out.println(flag);
    }
}
